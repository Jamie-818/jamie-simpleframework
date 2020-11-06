package com.jamie.simpleframework.inject;

import com.jamie.simpleframework.core.BeanContainer;
import com.jamie.simpleframework.inject.annotation.Autowired;
import com.jamie.simpleframework.util.ClassUtil;
import com.jamie.simpleframework.util.ValidationUtil;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.Set;

/**
 * 依赖注入器
 * @author jamie
 * @date 20.11.5 15:48
 */
@Slf4j
public class DependencyInjector {

    /**
     * Bean容器
     */
    private BeanContainer beanContainer;

    public DependencyInjector() {
        beanContainer = BeanContainer.getInstance();
    }

    /**
     * 执行Ioc
     */
    public void doIoc() {
        if(ValidationUtil.isEmpty(beanContainer.getClasses())){
            log.warn("empty class set in BeanContainer");
            return;
        }
        //1.遍历Bean容器中所有的Class对象
        for(Class<?> clazz: beanContainer.getClasses()){
            //2.遍历Class对象的所有成员变量
            Field[] fields = clazz.getDeclaredFields();
            if(ValidationUtil.isEmpty(fields)){
                continue;
            }
            for(Field field: fields){
                //3.找出被Autowired标记的成员变量
                if(field.isAnnotationPresent(Autowired.class)){
                    Autowired autowired = field.getAnnotation(Autowired.class);
                    String autowiredValue = autowired.value();
                    //4.获取这些成员变量的类型
                    Class<?> fieldClass = field.getType();
                    //5.获取这些成员变量的类型在容器里对应的实例
                    Object fieldValue = getFieldInstance(fieldClass, autowiredValue);
                    if(fieldValue == null){
                        throw new RuntimeException("unable to inject relevant type，target fieldClass is:"
                                + fieldClass.getName()
                                + " autowiredValue is : "
                                + autowiredValue);
                    }else{
                        //6.通过反射将对应的成员变量实例注入到成员变量所在类的实例里
                        Object targetBean = beanContainer.getBean(clazz);
                        ClassUtil.setField(field, targetBean, fieldValue, true);
                    }
                }
            }
        }

    }

    /**
     * 根据Class在beanContainer里获取其实例或者实现类
     * @param fieldClass     Class对象
     * @param autowiredValue autowired注解的值
     * @return java.lang.Object
     */
    private Object getFieldInstance(Class<?> fieldClass, String autowiredValue) {
        Object fieldValue = beanContainer.getBean(fieldClass);
        if(fieldValue != null){
            return fieldValue;
        }else{
            Class<?> implementedClass = getImplementedClass(fieldClass, autowiredValue);
            if(implementedClass != null){
                return beanContainer.getBean(implementedClass);
            }else{
                return null;
            }
        }
    }

    /**
     * 获取接口的实现类
     * @param fieldClass     接口Class或者父类Class
     * @param autowiredValue autowired注解的值
     * @return java.lang.Class<?>
     */
    private Class<?> getImplementedClass(Class<?> fieldClass, String autowiredValue) {
        // 获取实现类
        Set<Class<?>> classSet = beanContainer.getClassesBySuper(fieldClass);
        // 没有实现类，直接返回空
        if(ValidationUtil.isEmpty(classSet)){
            return null;
        }
        // 判断实例有没有autowired注解
        if(ValidationUtil.isEmpty(autowiredValue)){
            // 如果是空，说明没有指定使用哪个实现类，如果实现类只有一个，则返回，如果是多个实现类，则抛出异常
            if(classSet.size() == 1){
                return classSet.iterator().next();
            }else{
                //如果多于两个实现类且用户未指定其中一个实现类，则抛出异常
                throw new RuntimeException("multiple implemented classes for "
                        + fieldClass.getName()
                        + " please set @Autowired's value to pick one");
            }
        }else{
            // 如果指定了实现类，则找到该实现类进行返回
            for(Class<?> clazz: classSet){
                if(autowiredValue.equals(clazz.getSimpleName())){
                    return clazz;
                }
            }
        }
        return null;
    }

}

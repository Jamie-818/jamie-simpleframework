package com.jamie.simpleframework.util;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.Set;

/**
 * 测试类
 * @author jamie
 * @date 20.11.1 17:49
 */
public class ClassUtilTest {

    @DisplayName("提取目标类方法：extractPackageClass")
    @Test
    public void extractPackageClass() {
        Set<Class<?>> classSet = ClassUtil.extractPackageClass("com.jamie.demo.entity");
        System.out.println(classSet);
        classSet.forEach(System.out::println);
        Assertions.assertEquals(4, classSet.size());

    }

}

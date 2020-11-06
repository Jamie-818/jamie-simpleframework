package com.jamie.simpleframework.inject;

import com.jamie.demo.controller.frontend.MainPageController;
import com.jamie.demo.service.combine.impl.HeadLineShopCategoryCombineServiceImpl;
import com.jamie.demo.service.combine.impl.HeadLineShopCategoryCombineServiceImpl2;
import com.jamie.simpleframework.core.BeanContainer;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class DependencyInjectorTest {

    @DisplayName("依赖注入doIoc")
    @Test
    public void doIocTest() {
        BeanContainer beanContainer = BeanContainer.getInstance();
        beanContainer.loadBeans("com.jamie.demo");
        Assertions.assertTrue(beanContainer.isLoaded());
        MainPageController mainPageController = (MainPageController)beanContainer.getBean(MainPageController.class);
        Assertions.assertTrue(mainPageController instanceof MainPageController);
        Assertions.assertNull(mainPageController.getHeadLineShopCategoryCombineService());
        new DependencyInjector().doIoc();
        Assertions.assertNotEquals(null, mainPageController.getHeadLineShopCategoryCombineService());
        Assertions.assertTrue(mainPageController.getHeadLineShopCategoryCombineService() instanceof HeadLineShopCategoryCombineServiceImpl);
        Assertions.assertFalse(mainPageController.getHeadLineShopCategoryCombineService() instanceof HeadLineShopCategoryCombineServiceImpl2);
    }

}

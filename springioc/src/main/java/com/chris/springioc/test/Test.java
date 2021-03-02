package com.chris.springioc.test;

import com.chris.springioc.config.AppConfig;
import com.chris.springioc.service.InterfaceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangh
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        InterfaceService interfaceService = (InterfaceService) annotationConfigApplicationContext.getBean("interfaceService");
        interfaceService.service();
    }
}

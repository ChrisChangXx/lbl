package com.chris.lubanspring.test;

import com.chris.lubanspring.service.UserService;
import com.chris.lubanspring.util.BeanFactory;

public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory("spring.xml");
        UserService userService = (UserService) beanFactory.getBean("service");
        userService.find();
    }
}

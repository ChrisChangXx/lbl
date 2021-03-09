package com.chris.proxy.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomInvocationHandlerImpl implements CustomInvocationHandler {

    private Object target;

    public CustomInvocationHandlerImpl(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Method method) {
        try {
            System.out.println("---------------------");
            method.invoke(target);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}

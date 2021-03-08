package com.chris.proxy.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LubanInvocationHandler implements InvocationHandler {

    private Object target;

    public LubanInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 调用
     *
     * @param proxy  代理对象
     * @param method 目标方法
     * @param args   目标方法的参数
     * @return {@link Object}
     * @throws Throwable throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("LubanInvocationHandler jdk");
        return method.invoke(target, args);
    }
}

package com.chris.proxy.util;

import java.lang.reflect.Method;

public interface CustomInvocationHandler {
    Object invoke(Method method);
}

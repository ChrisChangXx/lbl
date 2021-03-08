package com.chris.proxy.test;

import com.chris.proxy.dao.LubanDao;
import com.chris.proxy.dao.LubanDaoImpl;
import com.chris.proxy.util.LubanInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @创建人 zhanghui
 * @创建时间 2021/3/7
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        //静态代理
//        LubanDaoImpl dao = new UserDaoLogImpl();
//        dao.query();
//        UserDao target = new LubanDaoImpl();
//        UserDaoLog logProxy = new UserDaoLog(target);
//        UserDaoTime timeProxy = new UserDaoTime(logProxy);
//        timeProxy.query();

        //自己编写的代理
        /*LubanDao dao = (LubanDao) ProxyUtil.newInstance(new LubanDaoImpl());
        dao.query1("sssss");*/

        //jdk动态代理
        LubanDao jdkProxy = (LubanDao) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{LubanDao.class},new LubanInvocationHandler(new LubanDaoImpl()));
        jdkProxy.query1("jdk proxy");
    }
}

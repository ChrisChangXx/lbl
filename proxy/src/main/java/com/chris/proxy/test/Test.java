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
        //静态代理-1.继承
        /*UserDao logDao = new UserDaoLogImpl();
        logDao.query();
        UserDao timeDao = new UserDaoTimeImpl();
        timeDao.query();
        UserDao powerDao = new UserDaoPowerImpl();
        powerDao.query();
        //可以采用这种方式实现链式
        UserDao logPowerDao = new UserDaoLogPowerImpl();
        logPowerDao.query();*/

        //静态代理-2.聚合
        /*UserDao target = new UserDaoImpl();
        UserDaoLog logProxy = new UserDaoLog(target);
        UserDaoTime timeProxy = new UserDaoTime(logProxy);
        UserDaoPower powerProxy = new UserDaoPower(timeProxy);
        powerProxy.query();*/

        //自己编写的代理
        /*LubanDao lubanDao = (LubanDao) ProxyUtil.newInstance(new LubanDaoImpl());
        lubanDao.query();
        lubanDao.query1("LubanDaoModify");*/

        //jdk动态代理
        LubanDao jdkProxy = (LubanDao) Proxy.newProxyInstance(Test.class.getClassLoader(),
                new Class[]{LubanDao.class},new LubanInvocationHandler(new LubanDaoImpl()));
        jdkProxy.query1("jdk proxy");

        //仿照jdk动态代理修改
        /*ChrisDao chrisDao = (ChrisDao) ProxyUtil.newInstance(ChrisDao.class, new CustomInvocationHandlerImpl(new ChrisDaoImpl()));
        try {
            chrisDao.query();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}

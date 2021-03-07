package com.chris.proxy.test;

import com.chris.proxy.dao.UserDao;
import com.chris.proxy.dao.UserDaoImpl;
import com.chris.proxy.proxy.UserDaoLogImpl;
import com.chris.proxy.proxy1.UserDaoLog;
import com.chris.proxy.proxy1.UserDaoTime;

/**
 * @创建人 zhanghui
 * @创建时间 2021/3/7
 * @描述
 */
public class Test {
    public static void main(String[] args) {
//        UserDaoImpl dao = new UserDaoLogImpl();
//        dao.query();
        UserDao target = new UserDaoImpl();
        UserDaoLog logProxy = new UserDaoLog(target);
        UserDaoTime timeProxy = new UserDaoTime(logProxy);
        timeProxy.query();
    }
}

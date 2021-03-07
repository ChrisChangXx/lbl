package com.chris.proxy.proxy1;

import com.chris.proxy.dao.UserDao;
import com.chris.proxy.dao.UserDaoImpl;

/**
 * @创建人 zhanghui
 * @创建时间 2021/3/7
 * @描述
 */
public class UserDaoLog implements UserDao {

    UserDao userDao;

    public UserDaoLog(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void query() {
        System.out.println("log");
        userDao.query();
    }
}

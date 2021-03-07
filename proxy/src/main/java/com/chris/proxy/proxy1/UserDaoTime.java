package com.chris.proxy.proxy1;

import com.chris.proxy.dao.UserDao;

/**
 * @创建人 zhanghui
 * @创建时间 2021/3/7
 * @描述
 */
public class UserDaoTime implements UserDao {

    UserDao userDao;

    public UserDaoTime(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void query() {
        System.out.println("time");
        userDao.query();
    }
}

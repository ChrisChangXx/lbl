package com.chris.proxy.proxy1;

import com.chris.proxy.dao.UserDao;

public class UserDaoPower implements UserDao {

    private UserDao userDao;

    public UserDaoPower(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void query() {
        System.out.println("power");
        userDao.query();
    }
}

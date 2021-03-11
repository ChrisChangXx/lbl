package com.chris.lubanspring.service;

import com.chris.lubanspring.dao.UserDao;

public class UserServiceImpl implements UserService {
    UserDao userDao;
    @Override
    public void find() {
        System.out.println("service");
        userDao.query();
    }
}

package com.chris.lubanspring.service;

import com.chris.lubanspring.anno.Luban;
import com.chris.lubanspring.dao.UserDao;

@Luban("userServiceImpl")
public class UserServiceImpl implements UserService {
    UserDao userDao;
    @Override
    public void find() {
        System.out.println("service");
        userDao.query();
    }
}

package com.chris.proxy.proxy;

import com.chris.proxy.dao.UserDaoImpl;

public class UserDaoTimeImpl extends UserDaoImpl {
    @Override
    public void query() {
        System.out.println("time");
        super.query();
    }
}

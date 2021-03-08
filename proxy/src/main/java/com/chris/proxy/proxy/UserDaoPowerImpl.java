package com.chris.proxy.proxy;

import com.chris.proxy.dao.UserDaoImpl;

public class UserDaoPowerImpl extends UserDaoImpl {
    @Override
    public void query() {
        System.out.println("power");
        super.query();
    }
}

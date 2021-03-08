package com.chris.proxy.proxy;

public class UserDaoLogPowerImpl extends UserDaoPowerImpl {
    @Override
    public void query() {
        System.out.println("log");
        super.query();
    }
}

package com.chris.proxy.dao;

public class LubanDaoImpl implements LubanDao {
    @Override
    public void query() {
        System.out.println("LubanDao");
    }
    @Override
    public void query1(String s) {
        System.out.println(s);
    }
}

package com.chris.proxy.dao;

public class ChrisDaoImpl implements ChrisDao {
    @Override
    public String query() throws Exception {
        System.out.println("ChrisDao");
        return "return";
    }
}

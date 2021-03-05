package com.chris.springaop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao implements Dao{
    @Override
    public void query1(String s) {
        System.out.println("test");
    }

    @Override
    public void query2() {
        System.out.println("test");
    }
}

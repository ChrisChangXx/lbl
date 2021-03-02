package com.chris.springioc.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zhangh
 */
@Repository
public class Dao {
    public void printf() {
        System.out.println("i am dao");
    }
}

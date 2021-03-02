package com.chris.springaop.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zhangh
 */
@Repository
public class IndexDao {
    public void print() {
        System.out.println("indexDao");
    }
}

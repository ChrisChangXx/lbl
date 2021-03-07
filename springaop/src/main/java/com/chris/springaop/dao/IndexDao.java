package com.chris.springaop.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/**
 * @author zhangh
 */
@Repository
@Scope("prototype")
public class IndexDao implements Dao{

    @Override
    public void query1(String s) {
        System.out.println("indexDao");
        System.out.println(s);
    }

    @Override
    public void query2() {

    }
}

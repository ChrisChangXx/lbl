package com.chris.springioc.dao.impl;

import com.chris.springioc.dao.InterfaceDao;
import org.springframework.stereotype.Repository;

/**
 * @author zhangh
 */
@Repository
public class InterfaceDaoImpl implements InterfaceDao {
    @Override
    public void printf() {
        System.out.println("i am interfaceDao");
    }
}

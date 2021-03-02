package com.chris.springioc.service;

import com.chris.springioc.dao.Dao;
import com.chris.springioc.dao.InterfaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author zhangh
 */
@Service("interfaceService")
public class InterfaceService {
    @Autowired
    Dao dao;

    @Autowired
    @Qualifier("interfaceDaoImpl1")
    InterfaceDao interfaceDao;

    public void service() {
        dao.printf();
        interfaceDao.printf();
    }
}

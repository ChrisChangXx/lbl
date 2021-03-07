package com.chris.proxy.proxy;

import com.chris.proxy.dao.UserDaoImpl;

/**
 * @创建人 zhanghui
 * @创建时间 2021/3/7
 * @描述
 */
public class UserDaoLogImpl extends UserDaoImpl {
    @Override
    public void query() {
        System.out.println("log");
        super.query();
    }
}

package com.chris.springlog.test;

import java.util.logging.Logger;

/**
 * @创建人 zhanghui
 * @创建时间 2021/4/4
 * @描述
 */
public class JUL {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("jul");
        logger.info("jul");
    }
}

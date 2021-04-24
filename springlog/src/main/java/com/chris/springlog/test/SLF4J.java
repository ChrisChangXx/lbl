package com.chris.springlog.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @创建人 zhanghui
 * @创建时间 2021/4/4
 * @描述
 */
public class SLF4J {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SLF4J.class);
        logger.info("slf4j");
    }
}

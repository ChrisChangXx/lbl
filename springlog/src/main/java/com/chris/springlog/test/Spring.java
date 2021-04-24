package com.chris.springlog.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @创建人 zhanghui
 * @创建时间 2021/4/4
 * @描述
 */
public class Spring {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(String.class);
        log.info("spring");
    }
}

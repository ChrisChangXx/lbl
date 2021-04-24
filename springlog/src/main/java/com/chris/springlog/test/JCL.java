package com.chris.springlog.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @创建人 zhanghui
 * @创建时间 2021/4/4
 * @描述
 * JCL 底层使用JUL或者Log4j
 */
public class JCL {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(JCL.class);
        log.info("jcl");
    }
}

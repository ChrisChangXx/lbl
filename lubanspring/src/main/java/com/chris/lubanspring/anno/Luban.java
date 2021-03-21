package com.chris.lubanspring.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @创建人 zhanghui
 * @创建时间 2021/3/21
 * @描述
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Luban {
    public String value();
}

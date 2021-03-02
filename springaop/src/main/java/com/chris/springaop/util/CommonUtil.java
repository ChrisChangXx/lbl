package com.chris.springaop.util;

import com.chris.springaop.annotation.Entity;
import com.chris.springaop.entity.CityEntity;

/**
 * @author zhangh
 */
public class CommonUtil {
    public static String build(CityEntity cityEntity) {
        String selectSql = "";
        Class clazz = cityEntity.getClass();
        if (clazz.isAnnotationPresent(Entity.class)) {
            Entity entity = (Entity) clazz.getAnnotation(Entity.class);
            String table = entity.value();
            selectSql = "select * from " + table;
        }
        return selectSql;
    }
}

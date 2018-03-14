package com.zz.springboot.util;

/**
 * Created by Francis.zz on 2018/3/14.
 */
public class RedisHelper {
    public static String redisCacheKey(Object id, Class clz) {
        return String.format("cache:%s:%s", clz.getSimpleName(), id);
    }
}

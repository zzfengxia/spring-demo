package com.zz.springboot.annotation;

import com.zz.springboot.constant.Constants;

import java.lang.annotation.*;

/**
 * 热点数据缓存处理
 * --------------------------------
 * create by Intellij IDEA.
 * @author Francis.zz
 * @date 2018-03-14 14:52
 * --------------------------------
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cacheable {
    long value() default Constants.DEFAULT_CACHE_TIME;
}

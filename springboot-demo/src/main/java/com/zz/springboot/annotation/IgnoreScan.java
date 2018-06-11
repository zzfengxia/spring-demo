package com.zz.springboot.annotation;

import java.lang.annotation.*;

/**
 * ************************************
 * create by Intellij IDEA
 * @author Francis.zz
 * @date   2018-06-09 11:27
 * @desc   忽略扫描
 * ************************************
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreScan {
}

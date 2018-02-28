package com.zz.springdemo.aop.caseone;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by Francis.zz on 2016/3/10.
 * 描述：异常通知，抛出异常时调用
 * ThrowsAdvice为标识性接口，写入afterThrowing方法
 */
public class MyThrowAdvice implements ThrowsAdvice {

    /**
     * @param m
     * @param objs
     * @param target
     * @param throwable
     */
    public void afterThrowing(Method m, Object[] objs, Object target, Exception throwable) {
        System.out.println("异常通知：" + m.getName() + "抛出异常 " + throwable);
    }
}

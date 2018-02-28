package com.zz.springdemo.aop.caseone;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Francis.zz on 2016/3/10.
 * 描述：环绕通知，进入代理对象的方法后执行该方法
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕通知：" + methodInvocation.getMethod().getName() + "执行前...");
        Object obj = methodInvocation.proceed();
        System.out.println("环绕通知：" + methodInvocation.getMethod().getName() + "执行后...");
        return obj;
    }
}

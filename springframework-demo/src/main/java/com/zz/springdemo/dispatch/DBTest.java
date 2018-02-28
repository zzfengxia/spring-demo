package com.zz.springdemo.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Francis.zz on 2016/3/4.
 * 描述：
 */
public class DBTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-dbutil.xml");

        // 获取属性文件中的值
        DBUtil dbUtil = (DBUtil) app.getBean("dbutil2");
        System.out.println(dbUtil.getDriverName());

        System.out.println(MyPropertyPlaceholderConfigurer.getProperty("name"));
    }
}

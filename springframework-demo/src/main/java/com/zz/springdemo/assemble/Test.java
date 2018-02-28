package com.zz.springdemo.assemble;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map.Entry;
import java.util.Set;

/**
 * Created by Francis.zz on 2016/3/1.
 * 描述：
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring-collection.xml");
        Department dep = (Department) app.getBean("department");

        System.out.println(dep.getName());
        // 取出数组集合
        System.out.println("-----------数组集合----------------");
        for(String name : dep.getDepartName()) {
            System.out.println(name);
        }
        // 取出List集合
        System.out.println("-----------List集合----------------");
        for(Employee e : dep.getEmployeeList()) {
            System.out.println(e.getName());
        }

        // 取出Set集合
        System.out.println("-----------Set集合----------------");
        for(Employee e : dep.getEmployeeSet()) {
            System.out.println(e.getName());
        }

        // 取出Map集合
        System.out.println("-----------Map集合----------------");
        Set<Entry<String, Employee>> entry = dep.getEmployeeMap().entrySet();
        for(Entry<String, Employee> e : entry) {
            System.out.println(e.getKey() + ":" + e.getValue().getName());
        }

        // 取出Properties属性值
        System.out.println("-----------Properties集合----------------");
        Set<Entry<Object, Object>> set = dep.getPp().entrySet();
        for(Entry e : set) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}

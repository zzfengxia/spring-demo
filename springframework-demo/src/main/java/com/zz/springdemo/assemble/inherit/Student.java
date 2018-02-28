package com.zz.springdemo.assemble.inherit;

/**
 * Created by Francis.zz on 2016/3/2.
 * 描述：
 */
public class Student extends Person {
    private String degree;  //学位

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}

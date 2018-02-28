package com.zz.springdemo.interfaces;

/**
 * Created by Francis.zz on 2016/2/23.
 * 描述：转换成小写
 */
public class LowerLetter implements ChangeLetter {
    private String str;

    public LowerLetter() {
        System.out.println("bean 被实例化！");
    }
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void change() {
        System.out.println(str.toLowerCase());
    }
}

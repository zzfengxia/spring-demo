package com.zz.springdemo.interfaces;

/**
 * Created by Francis.zz on 2016/2/23.
 * 描述：
 */
public class UpperLetter implements ChangeLetter {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void change() {
        System.out.println(str.toUpperCase());
    }
}

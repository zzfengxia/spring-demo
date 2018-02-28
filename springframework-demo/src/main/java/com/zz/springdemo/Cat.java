package com.zz.springdemo;

/**
 * Created by Francis.zz on 2016/2/23.
 * 描述：
 */
public class Cat {
    private String name;
    private Behavior behavior;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public Cat() {
        System.out.println("Cat Object is initialized!");
    }

    public void perform() {
        behavior.yell(name + "：喵~~~");
    }
}

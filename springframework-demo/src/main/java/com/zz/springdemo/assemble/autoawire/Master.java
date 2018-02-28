package com.zz.springdemo.assemble.autoawire;

/**
 * Created by Francis.zz on 2016/3/3.
 * 描述：
 */
public class Master {

    private String name;
    private Dog dog;

    public Master() {

    }
    public Master(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}

package com.cn.ben.controller;

/**
 * @Auther: ljh
 * @Date: 2019/8/6 15:16
 * @Description:
 */
public class User {

    private int age;
    private String name;

    User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
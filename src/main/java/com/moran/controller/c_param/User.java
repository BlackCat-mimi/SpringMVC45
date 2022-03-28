package com.moran.controller.c_param;

public class User {
    private String uname;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

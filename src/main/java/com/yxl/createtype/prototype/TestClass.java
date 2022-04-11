package com.yxl.createtype.prototype;

public class TestClass {
    private String name;
    private int age;
    private String gender;

    public TestClass() {
    }

    public TestClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("this bean is TestBean,name:" + this.name + ",age:" + this.age + ",gender:" + this.gender);
    }
}

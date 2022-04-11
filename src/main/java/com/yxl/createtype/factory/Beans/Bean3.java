package com.yxl.createtype.factory.Beans;

public class Bean3 implements IBean{
    private String name;

    public Bean3() {
        this.name = "Bean3";
    }

    @Override
    public void doSomething() {
        System.out.println("this bean name is :" + this.name);
    }
}

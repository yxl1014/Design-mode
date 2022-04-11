package com.yxl.createtype.factory.Beans;

public class Bean2 implements IBean{

    private String name;

    public Bean2() {
        this.name = "Bean2";
    }

    @Override
    public void doSomething() {
        System.out.println("this bean name is :" + this.name);
    }
}

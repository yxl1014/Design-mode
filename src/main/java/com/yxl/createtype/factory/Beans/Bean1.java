package com.yxl.createtype.factory.Beans;

public class Bean1 implements IBean {
    private String name;

    public Bean1() {
        this.name = "Bean1";
    }

    @Override
    public void doSomething() {
        System.out.println("this bean name is :" + this.name);
    }
}

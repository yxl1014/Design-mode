package com.yxl.structuraltype.adapter;

public class Adapter extends Adaptee implements ITarget {
    @Override
    public void request() {
        super.doSomething();
    }


    public static void test(){
        System.out.println("-------Adapter Test-------");
        ITarget adapter=new Adapter();
        adapter.request();
    }
}

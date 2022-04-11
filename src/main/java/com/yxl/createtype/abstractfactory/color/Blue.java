package com.yxl.createtype.abstractfactory.color;

public class Blue implements IColor{

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

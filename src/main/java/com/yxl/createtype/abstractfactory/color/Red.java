package com.yxl.createtype.abstractfactory.color;

public class Red implements IColor {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
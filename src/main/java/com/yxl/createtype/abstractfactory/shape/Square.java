package com.yxl.createtype.abstractfactory.shape;

public class Square implements IShape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

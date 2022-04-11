package com.yxl.createtype.abstractfactory;

import com.yxl.createtype.abstractfactory.color.Blue;
import com.yxl.createtype.abstractfactory.color.Green;
import com.yxl.createtype.abstractfactory.color.IColor;
import com.yxl.createtype.abstractfactory.color.Red;
import com.yxl.createtype.abstractfactory.shape.IShape;

public class ColorFactory extends AbstractFactory{
    @Override
    public IColor getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public IShape getShape(String shape) {
        return null;
    }
}

package com.yxl.createtype.abstractfactory;

import com.yxl.createtype.abstractfactory.color.IColor;
import com.yxl.createtype.abstractfactory.shape.Circle;
import com.yxl.createtype.abstractfactory.shape.IShape;
import com.yxl.createtype.abstractfactory.shape.Rectangle;
import com.yxl.createtype.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public IColor getColor(String color) {
        return null;
    }

    @Override
    public IShape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

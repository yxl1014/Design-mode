package com.yxl.createtype.abstractfactory;

import com.yxl.createtype.abstractfactory.color.IColor;
import com.yxl.createtype.abstractfactory.shape.IShape;

public abstract class AbstractFactory {
    public abstract IColor getColor(String color);
    public abstract IShape getShape(String shape);

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

    public static void test(){
        System.out.println("-------Abstract Factory Test-------");
        //获取形状工厂
        AbstractFactory shapeFactory = AbstractFactory.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        IShape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 Rectangle 的对象
        IShape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 Square 的对象
        IShape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = AbstractFactory.getFactory("COLOR");

        //获取颜色为 Red 的对象
        IColor color1 = colorFactory.getColor("RED");

        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 Green 的对象
        IColor color2 = colorFactory.getColor("GREEN");

        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 Blue 的对象
        IColor color3 = colorFactory.getColor("BLUE");

        //调用 Blue 的 fill 方法
        color3.fill();
    }
}

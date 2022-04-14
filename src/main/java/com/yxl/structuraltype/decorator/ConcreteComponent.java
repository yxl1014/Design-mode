package com.yxl.structuraltype.decorator;

public class ConcreteComponent implements IComponent{

    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void Ops() {
        System.out.println("具体的装饰");
    }
}

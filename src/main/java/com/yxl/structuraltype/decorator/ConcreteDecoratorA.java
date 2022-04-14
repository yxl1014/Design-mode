package com.yxl.structuraltype.decorator;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(IComponent component) {
        super(component);
    }

    public void Ops() {
        super.Ops();
        addedFunction();
    }
    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}

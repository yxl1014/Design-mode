package com.yxl.structuraltype.decorator;

public class Decorator implements IComponent {
    private IComponent component;

    public Decorator(IComponent component) {
        this.component = component;
    }

    @Override
    public void Ops() {
        this.component.Ops();
    }

    public static void test(){
        System.out.println("-------Decorator Test-------");
        IComponent p = new ConcreteComponent();
        p.Ops();
        System.out.println("---------------------------------");
        IComponent d = new ConcreteDecoratorA(p);
        d.Ops();
    }
}

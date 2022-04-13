package com.yxl.structuraltype.bridge;

public class Bridge {
    public static void test() {
        System.out.println("-------Adapter Test-------");
        IOps ops = new ConcreteImplops();
        Abstraction abstraction = new RefinedAbstraction(ops);
        abstraction.Opss();
    }
}

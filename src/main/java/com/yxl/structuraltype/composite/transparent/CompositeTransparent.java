package com.yxl.structuraltype.composite.transparent;

public class CompositeTransparent {
    public static void test(){
        System.out.println("-------CompositeTransparent Test-------");
        Component c0 = new Branch();
        Component c1 = new Branch();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
    }
}

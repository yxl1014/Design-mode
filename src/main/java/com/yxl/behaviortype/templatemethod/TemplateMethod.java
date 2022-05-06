package com.yxl.behaviortype.templatemethod;

public abstract class TemplateMethod {

    public int PrimitiveOperation1(int data) {
        System.out.println("is in PrimitiveOperation1");
        return ++data;
    }

    public int PrimitiveOperation2(int data) {
        System.out.println("is in PrimitiveOperation2");
        return ++data;
    }

    public abstract int TemplateMethods(int data);

    public static void test() {
        System.out.println("-------TemplateMethod Test-------");
        ConcreteClass c = new ConcreteClass();
        int i=c.TemplateMethods(2);
        System.out.println(i);
    }
}

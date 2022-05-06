package com.yxl.behaviortype.templatemethod;

public class ConcreteClass extends TemplateMethod {


    @Override
    public int TemplateMethods(int data) {
        System.out.println("is in TemplateMethods");
        int i = this.PrimitiveOperation1(data);
        i = this.PrimitiveOperation2(i);
        return i;
    }
}

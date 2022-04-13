package com.yxl.structuraltype.bridge;

public class ConcreteImplops implements IOps{
    @Override
    public void AbstractionOps() {
        System.out.println("他继承的抽象方法:"+this.getClass().getInterfaces()[0]+",他是谁:"+this.getClass()+",实现了。");
    }
}

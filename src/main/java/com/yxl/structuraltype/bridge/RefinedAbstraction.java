package com.yxl.structuraltype.bridge;

public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(IOps ops) {
        super(ops);
    }

    @Override
    public void Opss() {
        System.out.println("他是谁:" + this.getClass() + ",实现了。");
        this.ops.AbstractionOps();
    }
}

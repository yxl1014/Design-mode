package com.yxl.structuraltype.bridge;

public abstract class Abstraction {
    protected IOps ops;

    protected Abstraction(IOps ops) {
        this.ops = ops;
    }

    public abstract void Opss();
}

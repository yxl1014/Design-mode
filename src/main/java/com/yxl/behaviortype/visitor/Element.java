package com.yxl.behaviortype.visitor;

public interface Element {
    void accept(Visitor visitor);
}

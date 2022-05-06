package com.yxl.behaviortype.interpreter;

public abstract class AbstractExpression {
    public abstract void interpret(String context);
    public static void test(){
        System.out.println("-------Interpreter Test-------");
        AbstractExpression expression=new TestExpression();
        expression.interpret("yxl1___yxl2___yxl3#_#");
    }
}

package com.yxl.behaviortype.state;

public class ConcreteStateB extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B.");
        context.setState(new ConcreteStateA());
    }
}

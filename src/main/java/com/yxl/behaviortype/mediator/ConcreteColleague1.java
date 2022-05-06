package com.yxl.behaviortype.mediator;

public class ConcreteColleague1 extends Colleague {
    private String name;

    public ConcreteColleague1(String name) {
        this.name = name;
    }

    @Override
    public void receive() {
        System.out.println(name + "具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println(name + "具体同事类1发出请求。");
        mediator.relay(this);
    }
}

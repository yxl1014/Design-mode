package com.yxl.behaviortype.mediator;

public class ConcreteColleague2 extends Colleague {

    private String name;

    public ConcreteColleague2(String name) {
        this.name = name;
    }

    @Override
    public void receive() {
        System.out.println(name + "具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println(name + "具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}

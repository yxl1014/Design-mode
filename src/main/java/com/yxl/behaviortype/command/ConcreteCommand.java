package com.yxl.behaviortype.command;

public class ConcreteCommand implements Command{
    private Receiver receiver;


    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.action();
    }

    public static void test() {
        System.out.println("-------Command Test-------");
        Command cmd = new ConcreteCommand(new Receiver());
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}

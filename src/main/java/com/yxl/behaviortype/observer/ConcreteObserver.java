package com.yxl.behaviortype.observer;

public class ConcreteObserver implements Observer {

    private int state;

    public ConcreteObserver(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    @Override
    public void update(int state) {
        this.state = state;
    }

    public static void test() {
        System.out.println("-------Observer Test-------");
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver(1));
        subject.attach(new ConcreteObserver(2));
        subject.attach(new ConcreteObserver(3));

        subject.displaystate();
        System.out.println("-------Update State-------");
        subject.updateState(4);
        subject.displaystate();
    }
}

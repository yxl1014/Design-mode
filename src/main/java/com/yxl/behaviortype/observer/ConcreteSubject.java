package com.yxl.behaviortype.observer;

public class ConcreteSubject extends Subject {

    private int observerstate;

    @Override
    public void updateState(int observerstate) {
        this.observerstate = observerstate;
        for (Observer o : this.observers) {
            o.update(this.observerstate);
        }
    }

    public void displaystate(){
        for (Observer o : this.observers) {
            System.out.println("state:"+((ConcreteObserver)o).getState());
        }
    }
}

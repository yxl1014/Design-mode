package com.yxl.behaviortype.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagues=new ArrayList<>();
    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c:colleagues){
            if (!c.equals(colleague)){
                c.receive();
            }
        }
    }
}

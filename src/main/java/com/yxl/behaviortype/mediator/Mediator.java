package com.yxl.behaviortype.mediator;

import java.util.List;
import java.util.Map;

public abstract class Mediator {

    public abstract void register(Colleague colleague);

    public abstract void relay(Colleague colleague);

    public static void test() {
        System.out.println("-------Mediator Test-------");
        Mediator md = new ConcreteMediator();
        Colleague c1, c2, c3;
        c1 = new ConcreteColleague1("xxx");
        c2 = new ConcreteColleague2("yyy");
        c3 = new ConcreteColleague1("zzz");
        md.register(c1);
        md.register(c2);
        md.register(c3);
        c1.send();
        System.out.println("-------------");
        c2.send();
        System.out.println("-------------");
        c3.send();
    }
}

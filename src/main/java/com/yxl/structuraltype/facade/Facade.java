package com.yxl.structuraltype.facade;

import java.util.HashMap;

public class Facade {
    private HashMap<String, INet> map = new HashMap<>();

    public Facade() {
        this.map.put("HTTP", () -> System.out.println("this is HTTP"));
        this.map.put("UDP", () -> System.out.println("this is UDP"));
        this.map.put("TCP", () -> System.out.println("this is TCP"));
    }

    public void doSomething(Efacade efacade) {
        this.map.get(efacade.toString()).doSomething();
    }

    public static void test() {
        System.out.println("-------Facade Test-------");
        Facade f = new Facade();
        f.doSomething(Efacade.HTTP);
        f.doSomething(Efacade.UDP);
        f.doSomething(Efacade.TCP);
    }
}

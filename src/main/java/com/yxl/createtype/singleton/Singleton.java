package com.yxl.createtype.singleton;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    //获取唯一可用的对象
    public static Singleton getInstance(){
        return instance;
    }

    public static void test() {
        System.out.println("-------Singleton Test-------");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println("hashcode:" + Singleton.getInstance().hashCode())).start();
        }
    }
}

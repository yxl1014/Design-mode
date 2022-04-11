package com.yxl.createtype.prototype;

import java.lang.reflect.Field;

public class Prototype {
    public Object clone(Object obj) {
        System.out.println("is cloning");
        Class<?> cls = obj.getClass();
        System.out.println("get class name is " + cls.getName());
        try {
            Object ob = cls.newInstance();
            System.out.println("get all fields");
            Field[] fs = cls.getDeclaredFields();
            for (Field f : fs) {
                System.out.println("field name is " + f.getName());
                f.setAccessible(true);
                f.set(ob, f.get(obj));
                f.setAccessible(false);
            }
            return ob;
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void test() {
        System.out.println("-------Prototype Test-------");
        TestClass tc = new TestClass("xxx", 22, "nan");
        System.out.println("------tc------\nhashcode:" + tc.hashCode());
        tc.display();
        Prototype prototype = new Prototype();
        TestClass tc1 = (TestClass) prototype.clone(tc);
        System.out.println("------tc1------\nhashcode:" + tc1.hashCode());
        tc1.display();
    }
}

package com.yxl.createtype.builder;


public class BuildA implements IBuilder {

    @Override
    public void Build(Testclass tc) {
        System.out.println("BuildA is Building");
        tc.setXmlFile("xml A");
        tc.setYmlFile("yml A");
    }

    public static void test() {
        System.out.println("-------Build Test-------");
        IBuilder a = new BuildA();
        IBuilder b = new BuildB();

        Testclass tc = new Testclass();

        a.Build(tc);
        tc.display();

        b.Build(tc);
        tc.display();
    }
}

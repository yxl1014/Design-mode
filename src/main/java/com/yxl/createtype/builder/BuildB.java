package com.yxl.createtype.builder;

public class BuildB implements IBuilder {
    @Override
    public void Build(Testclass testClass) {
        System.out.println("BuildB is Building");
        testClass.setYmlFile("yml B");
        testClass.setXmlFile("xml B");
    }
}

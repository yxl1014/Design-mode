package com.yxl.createtype.builder;

public class Testclass {
    private String xmlFile;
    private String ymlFile;

    public void setXmlFile(String xmlFile) {
        this.xmlFile = xmlFile;
    }

    public void setYmlFile(String ymlFile) {
        this.ymlFile = ymlFile;
    }

    public void display() {
        System.out.println("this xmlfile is " + this.xmlFile + ",this ymlfile is " + this.ymlFile);
    }
}

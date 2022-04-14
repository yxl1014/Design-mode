package com.yxl.structuraltype.composite.safe;

import java.util.ArrayList;

public class Bags implements IArticles {
    private String name;     //名字
    private ArrayList<IArticles> bags = new ArrayList<IArticles>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(IArticles c) {
        bags.add(c);
    }

    public void remove(IArticles c) {
        bags.remove(c);
    }

    public IArticles getChild(int i) {
        return bags.get(i);
    }

    public float calculation() {
        float s = 0;
        for (Object obj : bags) {
            s += ((IArticles) obj).calculation();
        }
        return s;
    }

    public void show() {
        for (Object obj : bags) {
            ((IArticles) obj).show();
        }
    }
}

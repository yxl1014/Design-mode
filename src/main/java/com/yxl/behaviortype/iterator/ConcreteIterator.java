package com.yxl.behaviortype.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator{
    private List<Object> list = null;
    private int index = -1;
    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        ;
        return obj;
    }
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }

    public static void test(){
        System.out.println("-------Iterator Test-------");
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = it.first();
        System.out.println("\nFirst：" + ob.toString());
    }
}

package com.yxl.createtype.factory;

import com.yxl.createtype.factory.Beans.Bean1;
import com.yxl.createtype.factory.Beans.Bean2;
import com.yxl.createtype.factory.Beans.Bean3;
import com.yxl.createtype.factory.Beans.IBean;
import com.yxl.createtype.factory.Beans.TestBean;
import java.util.HashMap;
import java.util.Map;

public class Factory {
    private final Map<String, Object> beans = new HashMap();

    public Factory() {
        this.beans.put("bean1", new Bean1());
        this.beans.put("bean2", new Bean2());
        this.beans.put("bean3", new Bean3());
    }

    public Object getBean(String beanName) {
        System.out.println("get bean name is " + beanName);
        return this.beans.get(beanName);
    }

    public Object createBean(String beanName, Object obj) {
        System.out.println("Is creata Bean, name is " + beanName);
        Object oldObj = null;
        if (this.beans.containsKey(beanName)) {
            System.out.println("have old bean");
            oldObj = this.beans.get(beanName);
        }
        this.beans.put(beanName, obj);
        return oldObj;
    }

    public static void test() {
        System.out.println("-------Factory Test-------");
        Factory factory = new Factory();
        IBean b1 = (Bean1) factory.getBean("bean1");
        b1.doSomething();
        IBean b2 = (Bean2) factory.getBean("bean2");
        b2.doSomething();
        IBean b3 = (Bean3) factory.getBean("bean3");
        b3.doSomething();
        factory.createBean("testBean", new TestBean("xxx", 22, "nan"));
        TestBean tb = (TestBean) factory.getBean("testBean");
        tb.display();
    }
}

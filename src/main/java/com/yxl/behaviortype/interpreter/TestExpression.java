package com.yxl.behaviortype.interpreter;

public class TestExpression extends AbstractExpression {//data1___data2___data3#_#    spilt *_*  end #_#

    @Override
    public void interpret(String context) {
        String split = "___";
        String end = "#_#";
        String[] ss = context.split(split);
        String[] sss = ss[ss.length - 1].split(end);
        if (sss.length > 1) {
            System.out.println("have no end!!!");
            return;
        }
        int i = 0;
        for (; i < ss.length - 1; i++) {
            System.out.println("data"+(i+1)+":"+ss[i]);
        }
        System.out.println("data"+(i+1)+":"+sss[0]);
    }
}

package com.yxl.behaviortype.state;

public abstract class State {
    public abstract void Handle(Context context);

    public static void test() {
        System.out.println("-------State Test-------");
        Context context = new Context();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}

package com.yxl.structuraltype.proxy;

public class ProxyPattern {
    public static void test() {
        System.out.println("-------Proxy Test-------");
        IUserService userService = new UserServiceImpl();
        // 实例化InvocationHandler
        ProxyInvokeHandle invocationHandler = new ProxyInvokeHandle(userService);
        // 根据目标对象生成代理对象
        IUserService proxy = (IUserService) invocationHandler.getProxy();

        proxy.doSomething();
    }
}

package com.yxl.structuraltype.proxy;

public class UserServiceImpl implements IUserService {
    @Override
    public void doSomething() {
        System.out.println("UserServiceImpl method is invoke");
    }
}

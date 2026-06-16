package com.learn.oops.inheritance.interfaces;

public class ClassB implements MemberData{
    @Override
    public void basicData() {
        System.out.println("CLASS B ======");

    }

    @Override
    public void newData() {
        MemberData.super.newData();
        System.out.println("Over ride new data");
    }
}

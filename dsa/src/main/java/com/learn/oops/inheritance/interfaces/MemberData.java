package com.learn.oops.inheritance.interfaces;

public interface MemberData {
    void basicData();
    default void newData(){
        System.out.println("=======JUNIORRRR==========");
    }
}

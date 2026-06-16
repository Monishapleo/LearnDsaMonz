package com.learn.collections.sets;

import java.util.HashSet;

public class HashSetWork {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();

        employees.add("Dev");
        employees.add("Tester");
        employees.add("Devops");
        employees.add("Dev");
        employees.add(null);
        employees.add(null);

        System.out.println(employees);
    }
}

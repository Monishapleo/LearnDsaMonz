package com.learn.dsa.inheritence;

public class Employee {

    int id;
    String name;
    Double salary;

    public Employee() {
    }

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void employeeData() {

        System.out.println("Emp id is : " + id);
        System.out.println("Emp name is : " + name);
       // System.out.println("Emp salary is : " + salary);
    }
}
package com.learn.oops.inheritance;

public class Student extends Common{
    private double collageFee;

    public Student() {
    }

    public Student(String name, String age, String course, double collageFee) {
        super(name, age, course);
        this.collageFee = collageFee;
    }

    @Override
    void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("student collage fee : "+collageFee);
    }
}

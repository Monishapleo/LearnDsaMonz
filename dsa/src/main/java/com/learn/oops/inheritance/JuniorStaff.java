package com.learn.oops.inheritance;

public class JuniorStaff extends Staff{
    String from;
    public JuniorStaff(String name, String age, String course, double yearsOfExperience) {
        super(name, age, course, yearsOfExperience);
    }

    public JuniorStaff(String name, String age, String course, double yearsOfExperience, String from) {
        super(name, age, course, yearsOfExperience);
        this.from = from;

    }

    @Override
    void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Staffed from : "+from);
    }
}

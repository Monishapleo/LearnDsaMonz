package com.learn.oops.inheritance;

public class Staff extends Common{
    private double yearsOfExperience;

    public Staff(String name, String age, String course, double yearsOfExperience) {
        super(name, age, course);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Years of experience : "+yearsOfExperience);
    }
}

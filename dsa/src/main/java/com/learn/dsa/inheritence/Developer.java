package com.learn.dsa.inheritence;

public class Developer extends Employee{
    String programingLanguage;
    String designation;

    public Developer(String programingLanguage, String designation) {
        this.programingLanguage = programingLanguage;
        this.designation = designation;
    }

    public Developer(int id, String name,String programingLanguage) {
        super(id, name);
        this.programingLanguage = programingLanguage;
    }

    public Developer(int id, String name, Double salary, String programingLanguage, String designation) {
        super(id, name, salary);
        this.programingLanguage = programingLanguage;
        this.designation = designation;
    }


    void displayDeveloperDetails(){
        //employeeData(123,"Monisha",120000.0);

        employeeData();
        System.out.println("Programming Language: " + programingLanguage);
       // System.out.println("Designation : " + designation);
    }

    public static void main(String[] args) {
        Developer dev=new Developer(123,"Monisha",120000.0,"JAVA","Backend Engineer");
        dev.displayDeveloperDetails();

    }
}

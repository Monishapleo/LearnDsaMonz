package com.learn.oops.inheritance;

public class Main {
    public static void main(String[] args) {
        Common student = new Student("Monisha","26","JAVA",27000);
        Common staff=new Staff("Hemanth","33","JAVA-FULLSTACK",5);
        Common js=new JuniorStaff("Harshath","28","JAVA-FULLSTACK",1,"Ethiraj College");
        /*student.setName("Monisha");
        student.setAge("22");
        student.setCourse("Tech-Science");*/

        System.out.println("=====================================");
        student.displayStudentDetails();
        System.out.println("=====================================");
        staff.displayStudentDetails();
        System.out.println("=====================================");
        js.displayStudentDetails();
        System.out.println("=====================================");

    }
}

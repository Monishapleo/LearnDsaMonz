package com.learn.oops.inheritance;

public class Common {
    private String name;
    private String age;

    private String course;

    public Common() {
    }

    public Common(String name, String age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    void displayStudentDetails(){
        System.out.println("student name : "+name);
        System.out.println("student age : "+age);
        System.out.println("student course : "+course);
    }
}

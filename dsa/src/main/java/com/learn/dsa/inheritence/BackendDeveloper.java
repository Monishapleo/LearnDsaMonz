package com.learn.dsa.inheritence;

public class BackendDeveloper extends Developer {

    String framework;

    public BackendDeveloper(
            int id,
            String name,
            String programmingLanguage,
            String framework
    ) {

        super(id, name, programmingLanguage);

        this.framework = framework;
    }

    void backendDeveloperDetails() {

        displayDeveloperDetails();

        System.out.println("Framework: " + framework);
    }

    public static void main(String[] args) {

        BackendDeveloper dev = new BackendDeveloper(
                101,
                "Monisha",
                "Java",
                "Spring Boot"
        );

        dev.backendDeveloperDetails();
    }
}
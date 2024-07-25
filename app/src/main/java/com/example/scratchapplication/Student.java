package com.example.scratchapplication;

public class Student {

    private String name;
    private String email;
    private String college;

    public Student(String name, String email, String college) {
        this.name = name;
        this.email = email;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

package com.myproject.clients;

public class Patient {
    private String name;
    private String lastname;
    private int age;
    private String description;

    public Patient(String name, String lastname, int age, String description) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.description = description;
    }

    @Override
    public String toString() {
        return ""+name+" "+lastname;
    }
}

package com.myproject.clients;

import java.util.Scanner;

public class PatientFactory implements IPatient{
    private String name;
    private String lastname;
    private int age;
    private String description;

    @Override
    public Patient createPatient() {
        Scanner in=new Scanner(System.in);
        System.out.println("Name: ");
        name=in.nextLine().trim();
        System.out.println("Lastname: ");
        lastname=in.nextLine().trim();

        while (true) {
            System.out.println("Age");
            try {
                age = Integer.parseInt(in.nextLine().trim());
                break;
            }catch (Exception e){
                System.out.println("Check age");
            }
        }

        System.out.println("Description");
        description=in.nextLine();

        return new Patient(name,lastname,age,description);
    }
}

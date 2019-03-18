package com.myproject.registrationUtils;

import com.myproject.doctor.Doctor;

import java.util.Scanner;

public class Registration {

    public Registration() {
        Doctor therapist = new Doctor("Mike", "Wazowski", "Therapist");
        Doctor surgeon = new Doctor("James", "P. Sallivan", "Surgeon");
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("1-Appointment, 2-Delete Appointment, 3-Show Appointments, 4-Exit");
            String choice = in.nextLine();


            if (choice.equals("1")) {
                AddAppointment addAppointment = new AddAppointment(therapist,surgeon);
            }

            if(choice.equals("2")){
                DeleteAppointment deleteAppointment = new DeleteAppointment(therapist,surgeon);
            }

            if(choice.equals("3")){
                ShowAppointments showAppointments = new ShowAppointments(therapist,surgeon);
            }

            if(choice.equals("4")){
                break;
            }
        }
    }
}
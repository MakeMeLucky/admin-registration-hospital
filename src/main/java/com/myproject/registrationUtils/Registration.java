package com.myproject.registrationUtils;

import com.myproject.doctor.Doctor;

import java.util.Scanner;

public class Registration {

    public Registration() {
        Doctor therapist = new Doctor("Mike", "Wazowski", "Therapist");
        Doctor surgeon = new Doctor("James", "P. Sallivan", "Surgeon");
        AddAppointment addAppointment = new AddAppointment();
        DeleteAppointment deleteAppointment = new DeleteAppointment();
        ShowAppointments showAppointments = new ShowAppointments();
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("1-Appointment, 2-Delete Appointment, 3-Show Appointments, 4-Exit");
            String choice = in.nextLine();


            if (choice.equals("1")) {
                while (true) {

                    System.out.println("Choose a doctor:" + "\n" + "1- " + therapist + "   2- " + surgeon);
                    choice = in.nextLine();
                    if (choice.equals("1")) {
                        addAppointment.addAppointment(therapist);
                        break;
                    }
                    if (choice.equals("2")) {
                        addAppointment.addAppointment(surgeon);
                        break;
                    }
                }
            }

            if(choice.equals("2")){

            }

            if(choice.equals("3")){
                System.out.println(therapist.getStringTimeSet());
                System.out.println(therapist.getStringScheduleList());
            }

            if(choice.equals("4")){
                break;
            }


        }
    }
}

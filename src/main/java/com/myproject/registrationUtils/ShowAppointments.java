package com.myproject.registrationUtils;

import com.myproject.doctor.Doctor;

import java.util.Scanner;

public class ShowAppointments {

    public ShowAppointments(Doctor therapist, Doctor surgeon){
        String choice;
        Scanner in=new Scanner(System.in);
        System.out.println("1- " + therapist + "   2- " + surgeon+"  3-  "+therapist+" and "+surgeon);
        while(true) {
            choice = in.nextLine();
            if (choice.equals("1")) {
                showAppointments(therapist);
                break;
            }
            if (choice.equals("2")) {
                showAppointments(surgeon);
                break;
            }

            if (choice.equals("3")) {
                showAppointments(therapist,surgeon);
                break;
            }

        }
    }


    public void showAppointments(Doctor doctor1, Doctor doctor2){
        System.out.println(doctor1.getStringScheduleList()+"\n"+doctor2.getStringScheduleList());
    }

    public void showAppointments(Doctor doctor){
        System.out.println(doctor.getStringScheduleList());
    }

}

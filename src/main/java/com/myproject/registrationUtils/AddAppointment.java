package com.myproject.registrationUtils;

import com.myproject.clients.Patient;
import com.myproject.clients.PatientFactory;
import com.myproject.doctor.Doctor;

import java.time.LocalTime;
import java.util.Scanner;

public class AddAppointment {
    private PatientFactory patientFactory=new PatientFactory();
    private LocalTime time;

    public AddAppointment(Doctor therapist, Doctor surgeon) {
        Scanner in=new Scanner(System.in);
        String choice;
        while (true) {

            System.out.println("Choose a doctor:" + "\n" + "1- " + therapist + "   2- " + surgeon);
            choice = in.nextLine();
            if (choice.equals("1")) {
                addAppointment(therapist);
                break;
            }
            if (choice.equals("2")) {
                addAppointment(surgeon);
                break;
            }
        }
    }

    public void addAppointment(Doctor doctor){
        System.out.println(doctor);
        if(doctor.getTimeExist()==false) doctor.setTimeSet();

        System.out.println(doctor.getStringTimeSet());

        System.out.println("Your appointments");
        System.out.println(doctor.getStringScheduleList());

        if(doctor.getTimeSet().size()==doctor.getScheduleList().size()){
            System.out.println("No time! Only re-writing");
        }

        System.out.println("Time: ");

        while(true) {
            time = doctor.checkTime();

            if (doctor.getTimeSet().contains(time)) {
                Patient patient = patientFactory.createPatient();
                doctor.newAppointment(patient, time);
                break;

            } else System.out.println("Check time");
        }

    }

}

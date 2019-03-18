package com.myproject.registrationUtils;

import com.myproject.doctor.Doctor;
import com.myproject.schedules.ScheduleOfDoctors;

import java.time.LocalTime;
import java.util.Scanner;

public class DeleteAppointment {

    private LocalTime time;
    private String choice;
    private Scanner in;


    public DeleteAppointment(Doctor therapist,Doctor surgeon){
        System.out.println("1- " + therapist + "   2- " + surgeon);
        in=new Scanner(System.in);

        while(true) {
            choice = in.nextLine();
            if (choice.equals("1")) {
                deleteAppointment(therapist);
                break;
            }
            if (choice.equals("2")) {
                deleteAppointment(surgeon);
                break;
            }
        }
    }

    public void deleteAppointment(Doctor doctor) {

        if(!doctor.getScheduleList().isEmpty()) {
            System.out.println(doctor.getStringScheduleList());
            in = new Scanner(System.in);
            System.out.println("Time?");
            time = getTime();

            ScheduleOfDoctors schedule = new ScheduleOfDoctors(time);

            if(doctor.getScheduleList().contains(schedule)) {
                doctor.getScheduleList().remove(schedule);
                System.out.println("Success");
            } else System.out.println("No time found");
        }else System.out.println(doctor.getStringScheduleList());

    }

    private LocalTime getTime(){

        while (true) {
            try {
                choice = in.nextLine();
                time = LocalTime.parse(choice);
                break;
            } catch (Exception e) {
                System.out.println("Check time");
            }
        }

        return time;
    }

}

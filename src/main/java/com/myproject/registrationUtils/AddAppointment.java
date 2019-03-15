package com.myproject.registrationUtils;

import com.myproject.clients.Patient;
import com.myproject.clients.PatientFactory;
import com.myproject.doctor.Doctor;

import java.time.LocalTime;

public class AddAppointment {
    private PatientFactory patientFactory=new PatientFactory();
    private LocalTime time;

    public AddAppointment() {
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

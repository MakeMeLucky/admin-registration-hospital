package com.myproject.shedules;

import com.myproject.clients.Patient;

import java.time.LocalTime;

public class ScheduleOfDoctors{
    private Patient patient;
    private LocalTime time;

    public ScheduleOfDoctors() {
    }


    public void addPatient(Patient patient,LocalTime time){ // need to add check
        this.time=time;
        this.patient=patient;
    }

    public LocalTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return ""+patient + " " + time;
    }
}

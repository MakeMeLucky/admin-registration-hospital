package com.myproject.schedules;

import com.myproject.clients.Patient;

import java.time.LocalTime;
import java.util.Objects;

public class ScheduleOfDoctors{
    private Patient patient;
    private LocalTime time;

    public ScheduleOfDoctors() {
    }

    public ScheduleOfDoctors(LocalTime time){
        this.time=time;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleOfDoctors that = (ScheduleOfDoctors) o;
        return time.equals(that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time);
    }
}

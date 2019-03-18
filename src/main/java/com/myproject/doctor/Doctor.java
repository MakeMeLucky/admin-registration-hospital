package com.myproject.doctor;

import com.myproject.clients.Patient;
import com.myproject.comparators.ScheduleOfDoctorsComparator;
import com.myproject.comparators.TimeComparator;
import com.myproject.schedules.ScheduleOfDoctors;

import java.time.LocalTime;
import java.util.*;

public class Doctor {

    private String name;
    private String lastname;
    private String specialty;
    ScheduleOfDoctors schedule;
    private Set<ScheduleOfDoctors> scheduleList=new TreeSet<>(new ScheduleOfDoctorsComparator());
    private LocalTime time1,time2;
    private Set<LocalTime> timeSet;
    private Boolean isTimeExist=false;


    public Doctor(String name, String lastname, String specialty) {
        this.name = name;
        this.lastname = lastname;
        this.specialty = specialty;
    }

    public void setTimeSet(){ // for info and check new patient+time
        timeSet=new TreeSet<>(new TimeComparator());
        System.out.println("Beginning of the working day?");
        time1=checkTime();
        System.out.println("End of the day?");
        time2=checkTime();

        while (!time1.equals(time2)){
            timeSet.add(time1);
            time1=time1.plusMinutes(30);
        }
        isTimeExist=true;

    }

    public Set<LocalTime> getTimeSet(){ // for info
        return timeSet;
    }

    public String getStringTimeSet(){ //String version of getTimeSet
        return timeSet.toString().replace("[","").replace("]","");
    }



    public LocalTime checkTime(){ // is checking for exception of LocalTime
        LocalTime time;

        while(true) {

            Scanner in = new Scanner(System.in);
            String choice = in.nextLine().trim();

            try {
                time = LocalTime.parse(choice);
                return time;
            } catch (Exception e) {
                System.out.println("Check time");
            }
        }

    }

    public Boolean getTimeExist() {
        return isTimeExist;
    }


    public void newAppointment(Patient patient,LocalTime time) {

        schedule=new ScheduleOfDoctors();
        schedule.addPatient(patient,time);

        if(scheduleList.contains(schedule)){
            System.out.println("Re-write appointment?  1 Yes, 2 No");

            while(true){
                Scanner in = new Scanner(System.in);
                String choice = in.nextLine();
                if(choice.equalsIgnoreCase("1")|choice.trim().equalsIgnoreCase("Yes")){
                    scheduleList.remove(schedule);
                    scheduleList.add(schedule);
                    break;
                }
                if(choice.trim().equalsIgnoreCase("2")|choice.trim().equalsIgnoreCase("No")){
                    break;
                }
            }
        }else scheduleList.add(schedule);
    }

    public Set<ScheduleOfDoctors> getScheduleList() {
        return scheduleList;
    }

    public String getStringScheduleList(){ //String version of getScheduleList
        String local;
        if(getScheduleList().isEmpty()) local=this+"    Empty";
        else local=this+"   "+scheduleList.toString().replace("]","").replace("[","");
        return local;
    }

    @Override
    public String toString() {
        return ""+specialty +" "+ name +" "+lastname;
    }
}

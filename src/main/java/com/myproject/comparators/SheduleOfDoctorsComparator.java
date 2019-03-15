package com.myproject.comparators;

import com.myproject.shedules.ScheduleOfDoctors;
import java.util.Comparator;

public class SheduleOfDoctorsComparator implements Comparator<ScheduleOfDoctors> {
    @Override
    public int compare(ScheduleOfDoctors o1, ScheduleOfDoctors o2) {
        return o1.getTime().compareTo(o2.getTime());
    }
}

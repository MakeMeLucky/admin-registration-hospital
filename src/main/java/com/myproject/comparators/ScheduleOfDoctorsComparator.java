package com.myproject.comparators;

import com.myproject.schedules.ScheduleOfDoctors;
import java.util.Comparator;

public class ScheduleOfDoctorsComparator implements Comparator<ScheduleOfDoctors> {
    @Override
    public int compare(ScheduleOfDoctors o1, ScheduleOfDoctors o2) {
        return o1.getTime().toString().compareTo(o2.getTime().toString());
    }
}

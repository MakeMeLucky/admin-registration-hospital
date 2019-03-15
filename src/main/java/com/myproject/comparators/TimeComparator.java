package com.myproject.comparators;

import java.time.LocalTime;
import java.util.Comparator;

public class TimeComparator implements Comparator<LocalTime> { // compare time
    @Override
    public int compare(LocalTime o1, LocalTime o2) {
        return o1.toString().compareTo(o2.toString());
    }
}

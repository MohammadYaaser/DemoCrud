package com.national.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class GetDate {
    LocalDate date = LocalDate.now();
    LocalDateTime currentTime = LocalDateTime.now();

    public String getDate(int day) {
        return ( date.plusDays(day).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH) );
    }

    public LocalDateTime addTime(int add) {
        return currentTime.plusHours(add * 24);
    }
}

package com.national.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class WeekDayMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ElementCollection
    private List<LocalDate> dates = new ArrayList<LocalDate>();


    public WeekDayMethod() {
    }

    public WeekDayMethod( ArrayList<LocalDate> dates) {
        this.dates = dates;
    }

    /*public long getId() {
        return id;
    }*/

    private int getSize() {
        return dates.size();
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    @Override
    public String toString() {
        return "WeekDayMethod{" +
                "dates =" + dates +
                '}';
    }
}

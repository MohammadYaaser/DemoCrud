package com.national.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class WeekDay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String dayOfWeek;
    private boolean urlParam;
    private LocalDateTime time;

    public WeekDay() {
    }

    public WeekDay(String dayOfWeek, boolean urlParam, LocalDateTime time) {
        this.dayOfWeek = dayOfWeek;
        this.urlParam = urlParam;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public boolean isUrlParam() {
        return urlParam;
    }

    public void setUrlParam(boolean urlParam) {
        this.urlParam = urlParam;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "WeekDay{" +
                "id=" + id +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", urlParam=" + urlParam +
                ", time='" + time + '\'' +
                '}';
    }
}

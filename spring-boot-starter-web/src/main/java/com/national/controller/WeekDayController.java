package com.national.controller;


import com.national.models.WeekDay;
import com.national.repo.WeekDayRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class WeekDayController {
    public WeekDayController(WeekDayRepository weekDayRepository) {
        this.weekDayRepository = weekDayRepository;
    }

    private final WeekDayRepository weekDayRepository;

    @GetMapping("/weekdays")
    public List<WeekDay> getWeekDays() {
        return (List<WeekDay>) weekDayRepository.findAll();
    }

    @PostMapping("/weekdays/")
    void addWeekDay(@RequestBody WeekDay weekDay) {
        weekDayRepository.save(weekDay);
    }
}

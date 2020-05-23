package com.national.controller;

import com.national.models.WeekDayMethod;
import com.national.repo.WeekDayMethodRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class WeekDayMethodController {

    private final WeekDayMethodRepo weekDayMethodRepo;

    public WeekDayMethodController(WeekDayMethodRepo weekDayMethodRepo) {
        this.weekDayMethodRepo = weekDayMethodRepo;
    }

    @GetMapping("/dates")
    public List<WeekDayMethod> getDayMethod() {
        return (List<WeekDayMethod>) weekDayMethodRepo.findAll();
    }

    /*@PostMapping("/dates")
    public List<WeekDayMethod> saveDayMethod(@RequestBody WeekDayMethod weekDayMethod) {
        weekDayMethodRepo.save(weekDayMethod);
        return (List<WeekDayMethod>) weekDayMethodRepo.findAll();
    }*/

    @RequestMapping(value = "/dates", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public List<WeekDayMethod> saveDayMethod(@RequestBody WeekDayMethod weekDayMethod) {

        System.out.println(weekDayMethod.getDates().size());
        if (weekDayMethod.getDates().size() == 7) {
            weekDayMethodRepo.save(weekDayMethod);
            return (List<WeekDayMethod>) weekDayMethodRepo.findAll();
        } else {
            return (List<WeekDayMethod>) null;
        }
    }
}

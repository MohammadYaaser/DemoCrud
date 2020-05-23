package com.national;

import com.national.models.GetDate;
import com.national.models.WeekDayMethod;
import com.national.repo.WeekDayMethodRepo;
import com.national.repo.WeekDayRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.national.models.WeekDay;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootStarterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterWebApplication.class, args);
    }

    /*@Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
                User user = new User(name, name.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
           // userRepository.findAll().forEach(System.out::println);
        };
    }
*/
    int i = 0;
    GetDate getDate = new GetDate();

    @Bean
    CommandLineRunner start(WeekDayRepository weekDayRepository) {
        return args -> {
            for (int day = 0; day < 7; day++) {
                WeekDay weekDay = new WeekDay(getDate.getDate(i++), true, getDate.addTime(i));
                weekDayRepository.save(weekDay);
            }
            weekDayRepository.findAll().forEach(System.out::println);
        };
    }

    @Bean
    CommandLineRunner dates(WeekDayMethodRepo weekDayMethodRepo) {
        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
        LocalDate currentTime = LocalDate.now();
        return args -> {
            for (int no = 0; no < 7; no++) {
                dates.add(currentTime.plusDays(no));
            }
            WeekDayMethod weekDayMethod = new WeekDayMethod(dates);
            weekDayMethodRepo.save(weekDayMethod);
        };
    }
}
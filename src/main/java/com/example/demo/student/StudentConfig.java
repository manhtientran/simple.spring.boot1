package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 3),
                    21);

            Student mike = new Student(
                    ",Mike",
                    "mike@gmail.com",
                    LocalDate.of(1999, Month.AUGUST, 5),
                    22);

            repository.saveAll(
                    List.of(john, mike)
            );
        };
    }
}

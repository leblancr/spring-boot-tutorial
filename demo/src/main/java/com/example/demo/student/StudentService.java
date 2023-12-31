package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "rich",
                        "rkba001@proton.me",
                        LocalDate.of(1960, Month.JANUARY, 1),
                        64
                )
        );
    }

}

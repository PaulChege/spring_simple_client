package com.example.demo;

import com.example.demo.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class TestStudent implements CommandLineRunner {
    @Autowired
    private StudentFeignClient studentFeignClient;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void run(String... args) throws Exception {

        studentFeignClient.postStudent(new Student("Paul","Chege3","123456"));
        List<Student> students = studentFeignClient.getStudents();
        students.forEach(student -> {
            logger.info(student.getFirstName());
        });

    }

}

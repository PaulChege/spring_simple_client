package com.example.demo;


import com.example.demo.domain.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient (url="localhost:8080", name="students")
public interface StudentFeignClient {


    @RequestMapping(value = "students",method= RequestMethod.POST)
    Student postStudent(@RequestBody Student student);

    //for validation
    @RequestMapping(value = "students",method= RequestMethod.GET)
    List<Student> getStudents();
}

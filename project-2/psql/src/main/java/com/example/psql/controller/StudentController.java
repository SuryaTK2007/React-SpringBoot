package com.example.psql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.psql.model.Student;
import com.example.psql.service.StudentService;


@RestController
public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return s.getAllStudents();
    }
    
    @PostMapping("/students")
    public String AddStudent(@RequestBody Student std) {
        s.addStudent(std); 
        return "Success";
    }
    
}

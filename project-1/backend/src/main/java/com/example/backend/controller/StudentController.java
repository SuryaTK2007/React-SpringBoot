package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.model.Student;
import com.example.backend.service.StudentService;




@RestController
public class StudentController {
    @Autowired
    StudentService s;
    @GetMapping("students")
    public List<Student> getAllStudent() {
        return s.getAllStudent();
    }

    @GetMapping("students/{rollNo}")
    public Student getStudentByRollNo(@PathVariable("rollNo") int rNo) {
        return s.getStudentByRollNo(rNo);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student std) {
        s.addStudent(std);
        return "Success";
    }
    
    
}   

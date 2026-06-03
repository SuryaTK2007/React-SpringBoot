package com.example.psql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.psql.dto.StudentDto;
import com.example.psql.model.Student;
import com.example.psql.service.StudentService;

import jakarta.validation.Valid;


@RestController
public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return s.getAllStudents();
    }
    
    @PostMapping("/students")
    public String AddStudent(@Valid @RequestBody Student std) {
        s.addStudent(std);
        return "Success";
    }
    
    // @GetMapping("/students/{rollNo}")
    // public Student getStudentByRollNo(@PathVariable("rollNo") int roll){
    //     return s.getStudentByRollNo(roll);
    // }
    
    @PutMapping("students/{rollNo}")
    public String updateStudent(@PathVariable("rollNo") int roll, @RequestBody Student std) {
        s.updateStudent(roll, std);
        return "Success";
    }

    @DeleteMapping("/students/{rollNo}")
    public String deleteStudent(@PathVariable("rollNo") int roll) {
        s.deleteStudent(roll);
        return "Success";
    }

    @DeleteMapping("/students")
    public String deleteAllStudents() {
        s.deleteAllStudents();
        return "Success";
    }

    @GetMapping("/students/{tech}/{gender}")
    public List<Student> getStudentByGenderAndTech(@PathVariable("tech") String tech,
            @PathVariable("gender") String gender) {
        return s.getStudentByGenderAndTech(tech, gender);
    }
    
    @GetMapping("/students/tech/{tech}")
    public List<Student> getStudentByTech(@PathVariable("tech") String tech) {
        return s.getStudentByTech(tech);
    }
    @GetMapping("/students/gender/{gender}")
    public List<Student> getStudentByGender(@PathVariable("gender") String gender) {
        return s.getStudentByGender(gender);
    }

    @GetMapping("students/{rollNo}")
    public StudentDto getStudentByRollNo(@PathVariable("rollNo") int roll) {
        return s.getStudentByRollNo(roll);
    }
    
}

package com.example.security.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.security.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.security.web.csrf.CsrfToken;
import jakarta.servlet.http.HttpServletRequest;


@RestController
public class StudentController {
    List<Student> students = new java.util.ArrayList<>(List.of(
        new Student(1, "Suryatk", "Java"),
        new Student(2, "John", "Python"),
        new Student(3, "Alice", "JavaScript")
    ));
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    @PostMapping("/students")
    public List<Student> addStudent(@RequestBody Student std) {
        students.add(std);
        return students;
    }
    @GetMapping("csrf-token")
    public CsrfToken csrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute(CsrfToken.class.getName());
    } 
    
}

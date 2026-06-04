package com.example.security.controller;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.security.model.Student;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    List<Student> students = List.of(
        new Student(1, "Suryatk", "Java"),
        new Student(2, "John", "Python"),
        new Student(3, "Alice", "JavaScript")
    );
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    
}

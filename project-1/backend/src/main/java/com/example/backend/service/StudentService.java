package com.example.backend.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.backend.model.Student;

@Service
public class StudentService {
    List<Student> students=new ArrayList<>(Arrays.asList(
        new Student(1, "john", "java"),
        new Student(2, "alice", "python")
    ));

    public List<Student> getAllStudent() {
        return students;
    }
    
    public Student getStudentByRollNo(int rollNo) {
        return students.stream()
                .filter(s -> s.getRollNo() == rollNo)
                .findFirst()
                .orElse(null);
    }
}

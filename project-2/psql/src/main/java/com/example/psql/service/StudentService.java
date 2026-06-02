package com.example.psql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psql.model.Student;
import com.example.psql.repository.Repo;

@Service
public class StudentService {
    @Autowired
    Repo r;

    public List<Student> getAllStudents() {
        return r.findAll();
    }

    public void addStudent(Student std) {
        r.save(std);
    }

    public Student getStudentByRollNo(int roll) {
        return r.findById(roll).orElse(null);
    }

    public void updateStudent(int roll, Student std) {
        Student s = r.findById(roll).orElse(null);
        if (s != null) {
            s.setName(std.getName());
            s.setTech(std.getTech());
            r.save(s);
        }
    }

    public void deleteStudent(int roll) {
        r.deleteById(roll);
    }

    public void deleteAllStudents() {
        r.deleteAll();
    }
}

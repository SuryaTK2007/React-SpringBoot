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
}

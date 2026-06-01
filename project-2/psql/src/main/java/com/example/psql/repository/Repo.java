package com.example.psql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.psql.model.Student;

public interface Repo extends JpaRepository<Student, Integer> {
    
}

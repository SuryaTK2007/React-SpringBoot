package com.example.psql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.psql.model.Student;

public interface Repo extends JpaRepository<Student, Integer> {
    List<Student> findByTechAndGender(String tech, String gender);
    List<Student> findByTech(String tech);
    List<Student> findByGender(String gender);
}

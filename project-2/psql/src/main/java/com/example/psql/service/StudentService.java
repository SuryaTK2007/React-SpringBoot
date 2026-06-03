package com.example.psql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psql.dto.StudentDto;
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

    // public Student getStudentByRollNo(int roll) {
    //     return r.findById(roll).orElse(null);
    // }

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

    public List<Student> getStudentByGenderAndTech(String tech, String gender) {
        return r.findByTechAndGender(tech, gender);
    }

    public List<Student> getStudentByGender(String gender) {
        return r.findByGender(gender);
    }

    public List<Student> getStudentByTech(String tech) {
        return r.findByTech(tech);
    }

    public StudentDto getStudentByRollNo(int roll) {
        Student s1 = r.findById(roll).orElse(null);
        if (s1 != null) {
            return convertToDto(s1);
        }
        return null;
    }
    
    public StudentDto convertToDto(Student s) {
        StudentDto dto = new StudentDto();
        dto.setRollNo(s.getRollNo());
        dto.setName(s.getName());
        dto.setGender(s.getGender());
        dto.setTech(s.getTech());
        dto.setEmail(s.getEmail());
        return dto;
    }
}

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
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == rollNo) {
                index = i;
                flag = false;
            }
        }
        if (flag == true)
            return new Student();
        else
            return students.get(index);
    }
    
    public void addStudent(Student std) {
        students.add(std);
    }
}

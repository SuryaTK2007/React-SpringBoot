package com.example.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    private int rollNo;
    private String name;
    private String tech;

    public Student(int rollNo, String name, String tech) {
        this.rollNo = rollNo;
        this.name = name;
        this.tech = tech;
    }
}

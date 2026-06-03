package com.example.psql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private int rollNo;
    @NotBlank(message = "Name is mandatory")
    private String name;;
    private String gender;
    private String tech;
    @Email(message = "Email should be valid")
    private String email;
    private String password;
}

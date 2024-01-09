package com.example.springdatajpatutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity // It signals to the JPA provider that the class should be treated as a table in the database.
@Data // Getters & Setters of Properties
@AllArgsConstructor // set constructor with all properties
@NoArgsConstructor // set constructor without properties
@Builder // generate builder methods for classes.
@Table(name = "student") // set TABLE properties
public class Student {
    @Id // PRIMARY KEY for tuple
    private long studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;


}

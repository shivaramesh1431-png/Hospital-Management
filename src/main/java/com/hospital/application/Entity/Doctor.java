package com.hospital.application.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String Doctorcode;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false,unique = true)
    private String phoneNumber;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String specialization;
    @Column(nullable = false,unique = true)
    private String qualification;
    @Column(nullable = false)
    private int experience;
    @Column(nullable = false,unique = true)
    private String availability;



}

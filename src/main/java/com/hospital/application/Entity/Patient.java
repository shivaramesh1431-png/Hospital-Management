package com.hospital.application.Entity;

import com.hospital.application.Enum.BloodGroup;
import com.hospital.application.Enum.Patientstatus;
import com.hospital.application.Enum.gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String patientcode;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = true, length = 20)
    private String age;
    @Enumerated(EnumType.STRING)
    private gender gender;
    @Column(nullable = false,unique = true)
    private String phoneNumber;
    @Column(nullable = true,unique=true)
    private String email;
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;
    @Column(nullable = false,unique = true)
    private  String aadharNumber;
    @Column(unique = true)
    private String address;
    @Column(nullable = false)
    private String emergencyContact;
    @Column(nullable = false)
    private String admitDate;
    @Enumerated(EnumType.STRING)
    private Patientstatus status;

}





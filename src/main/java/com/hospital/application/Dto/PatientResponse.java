package com.hospital.application.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponse {
    private Long id;
    private String patientCode;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private String BloodGroup;
    private String aadharNumber;
    private String address;
    private String emergencyContact;
    private String admitDate;
    private String status;
}

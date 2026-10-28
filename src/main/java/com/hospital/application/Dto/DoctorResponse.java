package com.hospital.application.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DoctorResponse {
    private Long id;
    private String Doctorcode;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String phoneNumber;
    private String email;
    private String specialization;
    private String qualification;
    private String experience;
    private String availability;

}

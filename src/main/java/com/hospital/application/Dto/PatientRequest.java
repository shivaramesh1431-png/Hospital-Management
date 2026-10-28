package com.hospital.application.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientRequest {

    @NotBlank(message = "required")
    private String patientCode;
    @NotBlank(message = "Name is required")
    private String firstName;
    @NotBlank(message = "required")
    private String lastName;
    @NotBlank(message = "required")
    private int age;
    @NotBlank(message = "gender is required")
    private String gender;
    @Pattern(regexp = "^[6_9]\\d{9}",message = "invalid PhoneNumber")
    private String phoneNumber;
    @Email(message = "required")
    private String email;
    @NotBlank(message = "required")
    private String BloodGroup;
    @NotBlank(message = "required")
    private  String aadharNumber;
    @NotBlank(message = "required")
    private String address;
    @NotBlank(message = "required")
    private String emergencyContact;
    @NotBlank(message = "required")
    private String admitDate;
    @NotBlank(message = "required")
    private String status;

}


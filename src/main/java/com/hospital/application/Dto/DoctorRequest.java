package com.hospital.application.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class DoctorRequest {
    @NotBlank(message = "required")
    private Long id;
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
    private String specialization;
    @NotBlank(message = "required")
    private  String qualification;
    @NotBlank(message = "required")
    private String experience;
    @NotBlank(message = "required")
    private String availability;


}

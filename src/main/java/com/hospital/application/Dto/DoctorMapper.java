package com.hospital.application.Dto;


import com.hospital.application.Entity.Doctor;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" ,builder = @Builder(disableBuilder = true))

public interface DoctorMapper {


}

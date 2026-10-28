package com.hospital.application.Dto;

import com.hospital.application.Entity.Patient;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring",builder = @Builder(disableBuilder = true))

public interface PatientMapper {

    Patient toEntity(PatientRequest pt);
    PatientResponse toResponse(Patient s);

    void updatePatientFromRequest(PatientRequest Req, @MappingTarget Patient pt);


}

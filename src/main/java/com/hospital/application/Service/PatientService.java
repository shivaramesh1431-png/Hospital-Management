package com.hospital.application.Service;

import com.hospital.application.Dto.PatientMapper;
import com.hospital.application.Dto.PatientRequest;
import com.hospital.application.Dto.PatientResponse;
import com.hospital.application.Entity.Patient;
import com.hospital.application.Exception.ResourceNotFound;
import com.hospital.application.Repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.lang.module.ResolutionException;
import java.util.List;


@Slf4j
@Service
@AllArgsConstructor
public class PatientService {

    private final PatientRepository pr;
    private final PatientMapper pm;

    public List<PatientResponse> getAll() {
        log.info("patient all details");
        return pr.findAll().stream().map(pm::toResponse).toList();
    }
    public PatientResponse add(PatientRequest Req) {
        if (pr.findByPatientcode(Req.getPatientCode()).isPresent()) {
            log.warn("duplicate patient");

            throw new ResourceNotFound("patientcode already exsits");
        }
        if (pr.findByEmail(Req.getEmail()).isPresent()) {
            throw new ResourceNotFound("email is exsits");
        }
        if (pr.findByPhoneNumber(Req.getPhoneNumber()).isPresent()) {
            log.warn("duplicate phoneNumber");
            throw new ResourceNotFound("phoneNumber is exsits");
        }
        if (pr.findByAadharNumber(Req.getAadharNumber()).isPresent()) {
            log.warn("duplicate aadharNumber");
            throw new ResourceNotFound("AadharNumber is exist");
        }


         Patient p=pm.toEntity(Req);
        Patient save=pr.save(p);
        return pm.toResponse(save);
    }
    public PatientResponse getId(Long id) {
        Patient p =pr.findById(id).orElseThrow(() -> new ResourceNotFound("Patient not found with id: " + id));
        return pm.toResponse(p);
    }

    public PatientResponse update(PatientRequest Req, Long id) {
        Patient p= pr.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
        pm.updatePatientFromRequest(Req,p);
        /*Patient existingPatient = pr.findById(id).orElseThrow(() -> new RuntimeException("Patient not found"+id));
        existingPatient.setAadharNumber(pt.getAadharNumber());
        existingPatient.setAddress(pt.getAddress());
        existingPatient.setAdmitDate(pt.getAdmitDate());
        existingPatient.setFirstName(pt.getFirstName());
        existingPatient.setLastName(pt.getLastName());
        existingPatient.setAge(pt.getAge());
        existingPatient.setBloodGroup(pt.getBloodGroup());
        existingPatient.setEmail(pt.getEmail());
        existingPatient.setEmergencyContact(pt.getEmergencyContact());
        existingPatient.setGender(pt.getGender());
        existingPatient.setPatientcode(pt.getPatientcode());
        existingPatient.setPhoneNumber(pt.getPhoneNumber());
        existingPatient.setStatus(pt.getStatus());*/

        Patient update=pr.save(p);
        return pm.toResponse(update);
    }

    public void delete(Long id) {
        Patient p=pr.findById(id).orElseThrow(()->new RuntimeException("id is not found"));
        pr.delete(p)   ;
    }
}

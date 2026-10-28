package com.hospital.application.Repository;

import com.hospital.application.Entity.Doctor;
import com.hospital.application.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository  extends JpaRepository<Doctor, Long> {
}


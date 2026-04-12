package com.uday.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uday.hospitalmanagement.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

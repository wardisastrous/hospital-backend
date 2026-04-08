package com.uday.hospitalmanagement.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.uday.hospitalmanagement.entity.Patient;

@Service
public class PatientService {

    private final List<Patient> patients = new ArrayList<>();

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient savePatient(Patient patient) {
        patients.add(patient);
        return patient;
    }

    public void deletePatient(Long id) {
        patients.removeIf(p -> p.getId().equals(id));
    }
}

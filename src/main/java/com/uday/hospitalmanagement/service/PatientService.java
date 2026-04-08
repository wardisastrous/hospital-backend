package com.uday.hospitalmanagement.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.uday.hospitalmanagement.entity.Patient;
import com.uday.hospitalmanagement.repository.PatientRepository;

@Service
public class PatientService {

    private final PatientRepository repo;

    public PatientService(PatientRepository repo) {
        this.repo = repo;
    }

    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    public Patient savePatient(Patient patient) {
        return repo.save(patient);
    }

    public void deletePatient(Long id) {
        repo.deleteById(id);
    }
}
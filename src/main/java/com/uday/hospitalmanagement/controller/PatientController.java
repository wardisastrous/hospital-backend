package com.uday.hospitalmanagement.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.uday.hospitalmanagement.entity.Patient;
import com.uday.hospitalmanagement.service.PatientService;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "http://localhost:3000")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @GetMapping
    public List<Patient> getAll() {
        return service.getAllPatients();
    }

    @PostMapping
    public Patient add(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePatient(id);
    }
}
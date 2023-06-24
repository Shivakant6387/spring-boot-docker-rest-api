package com.example.springbootdockerrestapi.service;

import com.example.springbootdockerrestapi.model.Patient;
import com.example.springbootdockerrestapi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient createPatient(Patient patient) {
        // Additional validation and logic if needed
        return patientRepository.save(patient);
    }
}

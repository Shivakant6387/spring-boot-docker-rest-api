package com.example.springbootdockerrestapi.service;
import com.example.springbootdockerrestapi.exception.NotFoundException;
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
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Patient not found"));
    }

    public Patient createPatient(Patient patient) {
        // Additional validation and logic if needed
        return patientRepository.save(patient);
    }
    public Patient updatePatient(Long id, Patient patient) {
        Patient existingPatient = getPatientById(id);

        // Update the existing patient with the new information
        existingPatient.setName(patient.getName());
        existingPatient.setAddress(patient.getAddress());
        existingPatient.setPhoneNumber(patient.getPhoneNumber());

        return patientRepository.save(existingPatient);
    }

    public void deletePatient(Long id) {
        Patient patient = getPatientById(id);
        patientRepository.delete(patient);
    }
}

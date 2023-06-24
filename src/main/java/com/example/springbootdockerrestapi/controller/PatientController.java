package com.example.springbootdockerrestapi.controller;

import com.example.springbootdockerrestapi.model.Patient;
import com.example.springbootdockerrestapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @GetMapping("/patientAll")
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }
    @GetMapping("getPatient/{id}")
    public Patient getPatientById(Long id) {
        return patientService.getPatientById(id);
    }
    @PostMapping("/createPatient")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }
    @PutMapping("updatePatient/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return patientService.updatePatient(id,patient);
    }
    @DeleteMapping("/deletePatient/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }
}

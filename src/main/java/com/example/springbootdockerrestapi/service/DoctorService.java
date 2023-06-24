package com.example.springbootdockerrestapi.service;

import com.example.springbootdockerrestapi.model.Doctor;
import com.example.springbootdockerrestapi.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor createDoctor(Doctor doctor) {
        // Additional validation and logic if needed
        return doctorRepository.save(doctor);
    }
}

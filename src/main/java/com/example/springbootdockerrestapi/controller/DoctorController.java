package com.example.springbootdockerrestapi.controller;

import com.example.springbootdockerrestapi.model.Doctor;
import com.example.springbootdockerrestapi.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @GetMapping("/getAllDoctor")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
    @GetMapping("/getDoctor/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
    return doctorService.getDoctorById(id);
    }
    @PostMapping("/createDoctor")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
        return doctorService.createDoctor(doctor);
    }
    @PostMapping("/updateDoctor/{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor doctor) {
        return doctorService.updateDoctor(id,doctor);
    }
    @DeleteMapping("/deleteDoctor/{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorService.deleteDoctor(id);
    }
}

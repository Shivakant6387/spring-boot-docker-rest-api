package com.example.springbootdockerrestapi.dto;

import com.example.springbootdockerrestapi.model.Doctor;
import com.example.springbootdockerrestapi.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrescriptionDto {

    private String medicine;
    private String dosage;
    private Doctor doctor;
    private Patient patient;

}

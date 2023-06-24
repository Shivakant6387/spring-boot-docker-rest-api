package com.example.springbootdockerrestapi.dto;

import com.example.springbootdockerrestapi.model.Doctor;
import com.example.springbootdockerrestapi.model.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDto {
    private LocalDate date;
    private LocalTime time;
    private Doctor doctor;
    private Patient patient;
}

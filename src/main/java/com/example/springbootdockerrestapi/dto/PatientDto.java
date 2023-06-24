package com.example.springbootdockerrestapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PatientDto {

    private String name;
    private String address;
    private String phoneNumber;
}

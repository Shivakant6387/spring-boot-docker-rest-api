package com.example.springbootdockerrestapi.repository;

import com.example.springbootdockerrestapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}

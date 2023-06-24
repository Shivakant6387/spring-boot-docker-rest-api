package com.example.springbootdockerrestapi.repository;

import com.example.springbootdockerrestapi.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {
}

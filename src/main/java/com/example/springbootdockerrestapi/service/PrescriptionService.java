package com.example.springbootdockerrestapi.service;

import com.example.springbootdockerrestapi.exception.NotFoundException;
import com.example.springbootdockerrestapi.model.Prescription;
import com.example.springbootdockerrestapi.repository.PrescriptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {
    private PrescriptionRepository prescriptionRepository;

    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

    public Prescription getPrescriptionById(Long id) {
        return prescriptionRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Prescription not found"));
    }

    public Prescription createPrescription(Prescription prescription) {
        // Additional validation and logic if needed
        return prescriptionRepository.save(prescription);
    }

    public Prescription updatePrescription(Long id, Prescription prescription) {
        Prescription existingPrescription = getPrescriptionById(id);

        // Update the existing prescription with the new information
        existingPrescription.setMedicine(prescription.getMedicine());
        existingPrescription.setDosage(prescription.getDosage());
        existingPrescription.setDoctor(prescription.getDoctor());
        existingPrescription.setPatient(prescription.getPatient());

        return prescriptionRepository.save(existingPrescription);
    }

    public void deletePrescription(Long id) {
        Prescription prescription = getPrescriptionById(id);
        prescriptionRepository.delete(prescription);
    }
}

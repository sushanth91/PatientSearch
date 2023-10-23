package com.patientsearch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patientsearch.entity.Patient;
import com.patientsearch.repository.PatientRepository;

@Service
public class PatientService {
	
@Autowired
private PatientRepository patientRepository;

public List<Patient> searchByName(String name) {
 return patientRepository.findByPatientNameContaining(name);
}

public List<Patient> addPatients(List<Patient> patients) {
    List<Patient> savedPatients = patientRepository.saveAll(patients);
    return savedPatients;
}

}



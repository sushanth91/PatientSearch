package com.patientsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patientsearch.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	List<Patient> findByPatientNameContaining(String name);
}





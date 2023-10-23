package com.patientsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patientsearch.entity.Patient;
import com.patientsearch.service.PatientService;

@RestController
@RequestMapping("/api/search")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@PostMapping("/addpatients")
	public ResponseEntity<List<Patient>> addPatient(@RequestBody List<Patient> patient) {
		List<Patient> addedPatient = patientService.addPatients(patient);
		return ResponseEntity.status(HttpStatus.CREATED).body(addedPatient);
	}

	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> searchPatientsByName(@RequestParam String name) {
		List<Patient> searchResults = patientService.searchByName(name);
		if (searchResults.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(searchResults);
		}
	}
	@GetMapping("/patients/{name}")
	public ResponseEntity<List<Patient>> searchPatientsByName2(@PathVariable("name") String name) {
		List<Patient> searchResults = patientService.searchByName(name);
		if (searchResults.isEmpty()) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(searchResults);
		}
	}
}
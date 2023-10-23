package com.patientsearch.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Patient {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String patientName;
 private String patientIllness;
 private String age;
 private String location;
 private String email;
 private String mobile;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public String getPatientIllness() {
	return patientIllness;
}
public void setPatientIllness(String patientIllness) {
	this.patientIllness = patientIllness;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Patient(Long id, String patientName, String patientIllness, String age, String location, String email,
		String mobile) {
	super();
	this.id = id;
	this.patientName = patientName;
	this.patientIllness = patientIllness;
	this.age = age;
	this.location = location;
	this.email = email;
	this.mobile = mobile;
}
public Patient() {
}
 
}

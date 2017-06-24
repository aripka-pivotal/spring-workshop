package io.pivotal.patientsvc.repository;

import org.springframework.data.repository.CrudRepository;

import io.pivotal.patientsvc.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {
	
	
}

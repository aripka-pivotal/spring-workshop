package io.spring.workshop.patientsvc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PatientRepo extends CrudRepository<Patient, Long> {
	
	public Iterable<Patient> findByName(@Param("name") String name);
	
	public Iterable<Patient> findByNameStartsWith(@Param("name") String name);

}

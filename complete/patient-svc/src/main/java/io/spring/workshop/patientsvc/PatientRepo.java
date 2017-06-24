package io.spring.workshop.patientsvc;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PatientRepo extends CrudRepository<Patient, Long> {
	
	public List<Patient> findByName(@Param("name") String name);
	
	public List<Patient> findByNameStartsWith(@Param("name") String name);

}

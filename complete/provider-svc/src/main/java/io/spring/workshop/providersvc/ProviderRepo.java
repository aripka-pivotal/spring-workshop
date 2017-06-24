package io.spring.workshop.providersvc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProviderRepo extends CrudRepository<Provider, Long> {

	public Iterable<Provider> findByEmail(@Param("email") String email);
}

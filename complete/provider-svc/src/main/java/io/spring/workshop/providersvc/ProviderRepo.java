package io.spring.workshop.providersvc;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="provider", collectionResourceRel="providerCollection")
public interface ProviderRepo extends CrudRepository<Provider, Long> {

	public Iterable<Provider> findByEmail(@Param("email") String email);
}

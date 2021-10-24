package br.com.sprj.microservice.supplier.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.sprj.microservice.supplier.model.SupplierInfo;

@Repository
public interface InfoRepository extends CrudRepository<SupplierInfo, Long> {
	
	SupplierInfo findByState(String state);

}

package br.com.sprj.microservice.supplier.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.sprj.microservice.supplier.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByState(String state);

	List<Product> findByIdIn(List<Long> ids);

}

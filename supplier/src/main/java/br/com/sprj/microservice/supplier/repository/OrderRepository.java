package br.com.sprj.microservice.supplier.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.sprj.microservice.supplier.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
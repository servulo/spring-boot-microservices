package br.com.sprj.microservice.supplier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sprj.microservice.supplier.model.Product;
import br.com.sprj.microservice.supplier.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getProductsByState(String state) {
		return productRepository.findByState(state);
	}

}

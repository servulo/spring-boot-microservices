package br.com.sprj.microservice.supplier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprj.microservice.supplier.model.Product;
import br.com.sprj.microservice.supplier.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	public List<Product> getProductsByState(@PathVariable("state") String state) {
		return productService.getProductsByState(state);
	}

}

package br.com.sprj.microservice.supplier.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprj.microservice.supplier.dto.OrderItemDTO;
import br.com.sprj.microservice.supplier.model.Order;
import br.com.sprj.microservice.supplier.service.OrderService;

@RestController
@RequestMapping
public class OrderController {

	private OrderService orderService;

	@RequestMapping(method = RequestMethod.POST)
	public Order makeOrder(@RequestBody List<OrderItemDTO> items) {
		return orderService.makeOrder(items);
	}

	@RequestMapping("/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return orderService.getOrderById(id);
	}

}
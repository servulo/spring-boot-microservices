package br.com.sprj.microservice.supplier.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sprj.microservice.supplier.dto.OrderItemDTO;
import br.com.sprj.microservice.supplier.model.Order;
import br.com.sprj.microservice.supplier.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {
	
	private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private OrderService orderService;

	@RequestMapping(method = RequestMethod.POST)
	public Order makeOrder(@RequestBody List<OrderItemDTO> items) {
		LOG.info("OrderController => makeOrder");
		return orderService.makeOrder(items);
	}

	@RequestMapping("/{id}")
	public Order getOrderById(@PathVariable Long id) {
		return orderService.getOrderById(id);
	}

}
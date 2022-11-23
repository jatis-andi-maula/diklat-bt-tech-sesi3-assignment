package id.andimalik.app.order.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.andimalik.app.order.entities.Order;
import id.andimalik.app.order.services.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderService service;

	@PostMapping
	public ResponseEntity<Order> saveOrder(@RequestBody Order request) {
		Order order = service.saveOrder(request);
		return new ResponseEntity<Order>(order, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Order>> getAll() {
		List<Order> orders = service.findAllOrders();
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
	}

	@GetMapping
	@RequestMapping("/{orderId}")
	public ResponseEntity<Order> getOrder(@PathVariable("orderId") Integer orderId) {
		Optional<Order> order = service.findOrder(orderId);

		if (order.isPresent()) {
			return new ResponseEntity<Order>(order.get(), HttpStatus.OK);
		}

		return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
	}
}

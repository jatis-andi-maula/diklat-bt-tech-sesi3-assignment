package id.andimalik.app.order.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.andimalik.app.order.entities.Order;
import id.andimalik.app.order.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository repository;

	public Order saveOrder(Order order) {
		return repository.save(order);
	}

	public List<Order> findAllOrders() {
		return repository.findAll();
	}

	public Optional<Order> findOrder(Integer orderId) {
		return repository.findById(orderId);
	}
}

package id.andimalik.app.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.andimalik.app.order.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}

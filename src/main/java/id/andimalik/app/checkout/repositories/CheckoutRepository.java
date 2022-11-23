package id.andimalik.app.checkout.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.andimalik.app.checkout.entities.Checkout;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, Integer> {
}

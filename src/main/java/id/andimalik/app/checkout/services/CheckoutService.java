package id.andimalik.app.checkout.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.andimalik.app.checkout.entities.Checkout;
import id.andimalik.app.checkout.repositories.CheckoutRepository;

@Service
public class CheckoutService {
	@Autowired
	CheckoutRepository repository;

	public Checkout saveCheckout(Checkout checkout) {
		return repository.save(checkout);
	}

	public List<Checkout> findAllCheckouts() {
		return repository.findAll();
	}

	public Optional<Checkout> findCheckout(Integer checkoutId) {
		return repository.findById(checkoutId);
	}
}

package id.andimalik.app.checkout.controllers;

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

import id.andimalik.app.checkout.entities.Checkout;
import id.andimalik.app.checkout.services.CheckoutService;

@RestController
@RequestMapping("/checkouts")
public class CheckoutController {
	@Autowired
	CheckoutService service;

	@PostMapping
	public ResponseEntity<Checkout> saveCheckout(@RequestBody Checkout request) {
		Checkout checkout = service.saveCheckout(request);
		return new ResponseEntity<Checkout>(checkout, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Checkout>> getAll() {
		List<Checkout> checkouts = service.findAllCheckouts();
		return new ResponseEntity<List<Checkout>>(checkouts, HttpStatus.OK);
	}

	@GetMapping
	@RequestMapping("/{checkoutId}")
	public ResponseEntity<Checkout> getCheckout(@PathVariable("checkoutId") Integer checkoutId) {
		Optional<Checkout> checkout = service.findCheckout(checkoutId);

		if (checkout.isPresent()) {
			return new ResponseEntity<Checkout>(checkout.get(), HttpStatus.OK);
		}

		return new ResponseEntity<Checkout>(HttpStatus.NOT_FOUND);
	}
}

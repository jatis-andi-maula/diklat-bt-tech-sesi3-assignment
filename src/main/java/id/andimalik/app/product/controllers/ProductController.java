package id.andimalik.app.product.controllers;

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

import id.andimalik.app.product.entities.Product;
import id.andimalik.app.product.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService service;

	@PostMapping
	public ResponseEntity<Product> saveProduct(@RequestBody Product request) {
		Product product = service.saveProduct(request);
		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Product>> getAll() {
		List<Product> products = service.findAllProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}

	@GetMapping
	@RequestMapping("/{productId}")
	public ResponseEntity<Product> getProduct(@PathVariable("productId") Integer productId) {
		Optional<Product> product = service.findProduct(productId);

		if (product.isPresent()) {
			return new ResponseEntity<Product>(product.get(), HttpStatus.OK);
		}

		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}
}

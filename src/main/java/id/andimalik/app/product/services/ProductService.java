package id.andimalik.app.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.andimalik.app.product.entities.Product;
import id.andimalik.app.product.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> findAllProducts() {
		return repository.findAll();
	}

	public Optional<Product> findProduct(Integer productId) {
		return repository.findById(productId);
	}
}

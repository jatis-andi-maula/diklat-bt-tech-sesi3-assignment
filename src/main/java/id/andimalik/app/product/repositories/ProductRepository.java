package id.andimalik.app.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.andimalik.app.product.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

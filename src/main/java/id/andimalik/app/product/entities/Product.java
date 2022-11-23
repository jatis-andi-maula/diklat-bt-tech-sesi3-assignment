package id.andimalik.app.product.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PRODUCT_ID_GENERATOR")
	private Integer productId;
	@Column
	private String productName;
	@Column
	private BigDecimal price;
	@Column
	private String description;
}

package id.andimalik.app.order.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDERS")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "ORDER_ID_GENERATOR")
	private Integer orderId;
	@Column
	private Integer productId;
	@Column
	private BigDecimal count;
	@Column
	private BigDecimal amount;
}

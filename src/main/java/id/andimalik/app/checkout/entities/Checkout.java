package id.andimalik.app.checkout.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CHECKOUTS")
public class Checkout {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "CHECKOUT_ID_GENERATOR")
	private Integer checkoutId;
	@Column
	private Integer orderId;
	@Column
	private Integer userId;
	@Column
	private Boolean status;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date orderDate;
}

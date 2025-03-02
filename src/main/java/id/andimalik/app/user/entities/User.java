package id.andimalik.app.user.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USERS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "USER_ID_GENERATOR")
	private Integer userId;
	@Column
	private String name;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private String address;
}

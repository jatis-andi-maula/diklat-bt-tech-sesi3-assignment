package contracts.product

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Create a Product"
	request {
		url "/products"
		method HttpMethod.POST.toString()
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
			accept(MediaType.APPLICATION_JSON_VALUE)
		}
		body(
				productName: "Wireless Keyboard Mouse Combo",
				price: 300000,
				description: "Wireless Keyboard Mouse Combo"
				)
	}
	response {
		status CREATED()
		body(
				productId: anyNumber(),
				productName: "Wireless Keyboard Mouse Combo",
				price: 300000,
				description: "Wireless Keyboard Mouse Combo"
				)
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
		}
	}
}


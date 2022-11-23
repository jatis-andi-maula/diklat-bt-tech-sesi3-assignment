package contracts.product

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Get All Product"
	request {
		url "/products"
		method HttpMethod.GET.toString()
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
			accept(MediaType.APPLICATION_JSON_VALUE)
		}
	}
	response {
		status OK()
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
		}
		body(
				[
					[
						productId: anyNumber(),
						productName: "Wireless Keyboard Mouse Combo",
						price: 300000,
						description: "Wireless Keyboard Mouse Combo"
					]
				]
				)
	}
}




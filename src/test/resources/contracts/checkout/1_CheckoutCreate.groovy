package contracts.order

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Create a Checkout"
	request {
		url "/checkouts"
		method HttpMethod.POST.toString()
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
			accept(MediaType.APPLICATION_JSON_VALUE)
		}
		body(
				orderId: 3,
				userId: 900000,
				status: true,
				orderDate: "2022-11-23"
				)
	}
	response {
		status CREATED()
		body(
				checkoutId: anyNumber(),
				orderId: 3,
				userId: 900000,
				status: true,
				orderDate: "2022-11-23"
				)
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
		}
	}
}


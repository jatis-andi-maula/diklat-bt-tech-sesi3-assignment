package contracts.order

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Create an Order"
	request {
		url "/orders"
		method HttpMethod.POST.toString()
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
			accept(MediaType.APPLICATION_JSON_VALUE)
		}
		body(
				productId: 777,
				count: 3,
				amount: 900000
				)
	}
	response {
		status CREATED()
		body(
				orderId: anyNumber(),
				productId: 777,
				count: 3,
				amount: 900000
				)
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
		}
	}
}


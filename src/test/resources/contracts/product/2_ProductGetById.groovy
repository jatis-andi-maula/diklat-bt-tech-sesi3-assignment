package contracts.product

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Get a Product by ID"
	request {
		url '/products/1'
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
					productId: anyNumber(),
					productName: regex('.*'),
					price: anyNumber(),
					description: regex('.*')
				]
				)
	}
}

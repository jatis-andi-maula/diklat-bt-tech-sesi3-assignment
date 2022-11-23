package contracts.order

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Get All Checkouts"
	request {
		url "/checkouts"
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
						checkoutId: anyNumber(),
						orderId: anyNumber(),
						userId: anyNumber(),
						status: anyBoolean(),
						orderDate: isoDate()
					]
				]
				)
	}
}




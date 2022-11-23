package contracts.order

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Get Non-Existing Order"
	request {
		url '/orders/0'
		method HttpMethod.GET.toString()
		headers {
			contentType(MediaType.APPLICATION_JSON_VALUE)
			accept(MediaType.APPLICATION_JSON_VALUE)
		}
	}
	response {
		status 404
	}
}

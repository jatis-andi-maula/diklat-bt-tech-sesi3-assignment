package contracts.user

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Get a User"
	request {
		url "/users"
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
						"userId": anyNumber(),
						"name": "Alphonse the 2nd",
						"phone": "67890",
						"email": "alphonso2@jatis.com",
						"address": "Kutai Kartanegara"
					]
				]
				)
	}
}




package contracts.user

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
	description "Get a User by ID"
	request {
		url "/users/1"
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
					userId: anyNumber(),
					name: regex('.*'),
					phone: regex('.*'),
					email: email(),
					address: regex('.*')
				]
				)
	}
}

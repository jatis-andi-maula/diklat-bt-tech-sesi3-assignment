package id.andimalik.app.user.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import id.andimalik.app.user.entities.User;
import id.andimalik.app.user.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User request) {
		User user = service.saveUser(request);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<User>> getAll() {
		List<User> users = service.findAllUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@GetMapping
	@RequestMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable("userId") Integer userId) {
		Optional<User> user = service.findUser(userId);

		if (user.isPresent()) {
			return new ResponseEntity<User>(user.get(), HttpStatus.OK);
		}

		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}

}

package id.andimalik.app.user.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import id.andimalik.app.user.entities.User;
import id.andimalik.app.user.services.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	UsersService service;

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

}

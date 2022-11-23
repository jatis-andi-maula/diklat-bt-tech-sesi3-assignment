package id.andimalik.app.user.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.andimalik.app.user.entities.User;
import id.andimalik.app.user.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public List<User> findAllUsers() {
		return repository.findAll();
	}

	public Optional<User> findUser(Integer userId) {
		return repository.findById(userId);
	}
}

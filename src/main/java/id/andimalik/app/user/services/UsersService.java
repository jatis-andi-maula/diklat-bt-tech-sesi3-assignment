package id.andimalik.app.user.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.andimalik.app.user.entities.User;
import id.andimalik.app.user.repositories.UsersRepository;

@Service
public class UsersService {
    @Autowired
    UsersRepository repository;

    public User saveUser(User users){
        return repository.save(users);
    }

    public List<User> findAllUsers() {
		return repository.findAll();
    }
}

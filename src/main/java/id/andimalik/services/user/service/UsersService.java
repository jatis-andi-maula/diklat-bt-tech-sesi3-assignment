package id.andimalik.services.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.andimalik.services.user.entity.User;
import id.andimalik.services.user.repository.UsersRepository;

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

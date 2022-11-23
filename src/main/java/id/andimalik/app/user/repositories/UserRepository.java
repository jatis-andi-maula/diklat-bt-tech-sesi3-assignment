package id.andimalik.app.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.andimalik.app.user.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

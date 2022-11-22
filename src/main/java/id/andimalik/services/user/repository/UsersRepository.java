package id.andimalik.services.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.andimalik.services.user.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}

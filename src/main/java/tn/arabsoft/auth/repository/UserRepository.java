package tn.arabsoft.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.arabsoft.auth.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByMatricule(String id);
}

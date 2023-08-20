package com.online.payment.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.payment.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
}

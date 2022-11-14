package com.willianprates.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willianprates.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}

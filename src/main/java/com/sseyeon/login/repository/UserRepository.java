package com.sseyeon.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sseyeon.login.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);
	
}

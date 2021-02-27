package com.sseyeon.login.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sseyeon.login.entity.User;
import com.sseyeon.login.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	// for post methods
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	// for all
	public List<User> saveUser(List<User> user){
		return repository.saveAll(user);
	}
	
	// for get methods
	public List<User> getUser(){
		return repository.findAll();
	}
	
	public User getUserById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	// for fetching by name
	public User getUserByName(String name) {
		return repository.findByName(name);
	}
	
	// for delete method
	public String deleteUser(int id) {
		repository.deleteById(id);
		return "User removed !!" + id;
	}
	
	// update method
	public User updateUser(User user) {
		User existingUser = 
	}
	
}

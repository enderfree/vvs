package com.fdmgroup.vvs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.vvs.model.User;
import com.fdmgroup.vvs.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
	
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	public User findUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		
		if(user.isPresent()) return user.get();
		
		throw new NullPointerException("User not found.");
	}
}

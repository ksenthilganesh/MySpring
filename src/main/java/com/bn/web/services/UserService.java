package com.bn.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bn.web.entities.User;
import com.bn.web.repositories.UserRepository;

@Service
public class UserService {

	
	private UserRepository userRepository;
	@Autowired
	public void setUserRepository(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	public void saveUser(User user){
		System.out.println("Going to save");
		userRepository.save(user);
		System.out.println("Saved");
	}
}

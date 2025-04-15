package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.entity.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public User updateUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

}

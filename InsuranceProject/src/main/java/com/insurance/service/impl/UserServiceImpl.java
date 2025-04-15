package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.insurance.entity.User;
import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUserDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserDetails(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public String deleteUserDetails(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}

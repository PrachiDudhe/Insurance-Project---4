package com.insurance.service;

import com.insurance.entity.User;

public interface UserService {
	
	//Add User Details
	public User addUserDetails(User user);
	
	//Update User Details
	public User updateUserDetails(User user);
	
	//Delete User Details
	public String deleteUserDetails(Integer id);
	

}

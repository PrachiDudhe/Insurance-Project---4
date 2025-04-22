package com.insurance.service;

import com.insurance.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public User updateUser(User user);
	
	//public <List>User getUser(Integer id);
	
	public User getUser(Integer id);
	
	public void deleteUser(Integer id);

}

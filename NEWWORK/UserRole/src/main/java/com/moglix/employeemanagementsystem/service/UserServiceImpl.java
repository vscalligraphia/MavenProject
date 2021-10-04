package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.User;

public interface UserServiceImpl {
	

	public String addUser(User user);
	public String updateUser(String id, User user);
	public User getUseryId(String id);
	public User[] getUsers();
	public String deleteUserById(String id);
	public void deleteAllUser();
	


	
}

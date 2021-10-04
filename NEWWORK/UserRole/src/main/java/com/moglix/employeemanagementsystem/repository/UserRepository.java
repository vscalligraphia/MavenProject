package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.User;

public interface UserRepository {

	public String addUser(User user);
	public String updateUser(String id, User user);
	public User getUserById(String id);
	public User[] getUser();
	public String deleteUserById(String id);
	public void deleteAllUser();
	public static UserRepository getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

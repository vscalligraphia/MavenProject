package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.User;
import com.moglix.employeemanagementsystem.repository.UserDAO;
import com.moglix.employeemanagementsystem.repository.UserRepository;

public class UserService implements UserServiceImpl {
	
	
	

	UserDAO userDAO	= new UserDAO();
	
	UserRepository userRepository= UserRepository.getInstance();

	//Reference
	private static UserService  userService;
	
	//Constructor
	
	//private Method
	public static UserService getInstance() {
		
		if(userService == null)
		{
			userService = new UserService();
			return userService;
		}
		
		else
		{
			return userService;
		}
		
		
	}
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String addUser(User user) {
		return userDAO.addUser(user);
	}

	@Override
	public String updateUser(String id, User user) {
		return userDAO.updateUser(id, user);
	}

	@Override
	public User getUseryId(String id) {
		return userDAO.getUserById(id);
	}

	@Override
	public User[] getUsers() {
		return userDAO.getUser();
	}

	@Override
	public String deleteUserById(String id) {
	return userDAO.deleteEUserById(id);	
	}

	@Override
	public void deleteAllUser() {
		userDAO.deleteAllUser();
	}
	

}

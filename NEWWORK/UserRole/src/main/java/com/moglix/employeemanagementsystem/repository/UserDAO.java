package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.User;

public class UserDAO {
	
	private static int counter=0;
	
	User users[] = new User[10];
	
	public String addUser(User user) {

		
		if(counter<users.length) {
			users[counter++] = user;
			return "success";
		}
		
		else
			return "Array is full!!!!";
		
		
		
	}
	
	public User getUserById(String id) {
		for(User user : users) {
			if(user!=null && id.equals(user.getUser_Id())){
			return user;
			}
			
		}
		return null;	
		
	}
	
	private int getIndex(String id) {
		
		for(int i =0 ; i<users.length;i++) {
			if(users[i]!=null && users[i].getUser_Id().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	//DELETE USER by USER ID
	public String deleteEUserById(String id) {
		
		int index=this.getIndex(id);
		if(index!=-1) {
			users[index]=null;
		return "success";
		}
		else 
			return "not found";
	}
	
	// UPDATING Role
		public String updateUser(String id, User user) {
			
			int index = this.getIndex(id);
			
			if(index!=-1) {
				
				users[index]= user;
				return "Success";
			}
			else
				return "Not Found";
		}
	
	
		//DELETING ALL USERS
		public void deleteAllUser() {	
			users= null;	
		}
	
	

	
	public UserDAO() {
		// TODO Auto-generated constructor stub		
		}

	public User[] getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}

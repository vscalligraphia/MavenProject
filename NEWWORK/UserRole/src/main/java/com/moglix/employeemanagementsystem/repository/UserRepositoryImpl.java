package com.moglix.employeemanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;

import com.moglix.employeemanagementsystem.dto.User;

public class UserRepositoryImpl implements UserRepository {

	private UserRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static UserRepository UserRepository;
	
    public static UserRepository getInstance() {
	
		
		if(UserRepository == null)
		{
			UserRepository = new UserRepositoryImpl();
			return UserRepository;
		}
		
		else
		{
			return UserRepository;
		}
		
	}

	//private static int counter=0;

	User users[] = new User[10];
	
	private List<User>  usersa = new ArrayList<>();
	//private List<User>  users = new LinkedList<>();
	
	
	
	@Override
	public String addUser(User user) {
		boolean result = usersa.add(user);
		if(result) {
			return "Successwwwds";
			
		}
		else
			return "Faileddddd";}


	@Override
	public String updateUser(String id, User user) {
		

		int index = this.getIndex(id);
		
		if(index!=-1) {
			
			users[index]= user;
			return "Success";
		}
		else
			return "Not Found";
	}


	@Override
	public User getUserById(String id) {


		for (User user: users) {
			if(id.equals(user.getUser_Id()))
				return user;
		}
		
		return null;
	}


	@Override
	public User[] getUser() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<User> getUser1(){
		System.out.println("Hello");
		return usersa;
		
	}

	@Override
	public String deleteUserById(String id) {
		
	User user=this.getUserById(id);
	if(user!=null) {
		if(usersa.remove(user)) {
			return "success";
		}
		else
			return "failed";
	}
	else {
		return "Not foundddddd";
	}
	}


	@Override
	public void deleteAllUser() {
		// TODO Auto-generated method stub
		
	}
	
private int getIndex(String id) {
		
		for(int i =0 ; i<users.length;i++) {
			if(users[i]!=null && users[i].getUser_Id().equals(id)) {
				return i;
			}
		}
		return -1;
	}

/*	
private int getIndex(String id) {
		
		for(int i =0 ; i<users.length;i++) {
			if(users[i]!=null && users[i].getUser_Id().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public String updateUser(String id, User user) {
		int index = this.getIndex(id);
		
		if(index!=-1) {
			
			users[index]= user;
			return "Success";
		}
		else
			return "Not Found";
	}

	@Override
	public User getUserById(String id) {
		for(User user : users) {
			if(user!=null && id.equals(user.getRole_Id())) {
			
			return user;
		    }	
			
		}
		
		return null;
		
	}

	@Override
	public User[] getUser() {
		return users;
		
		
	}

	@Override
	public String deleteUserById(String id) {
		int index=this.getIndex(id);
		if(index!=-1) {
			users[index]=null;
		return "success";
		}
		else 
			return "not found";
	}


	@Override
	public void deleteAllUser() {
		// TODO Auto-generated method stub
		
	}
*/
}

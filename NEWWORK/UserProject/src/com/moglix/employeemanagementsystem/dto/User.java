package com.moglix.employeemanagementsystem.dto;

public class User {
	
	private String User_Id;
	private String User_Name;
	private double Password;
	private String Email;
	private String Role_Id;
	
	
	
	public User(String user_Id, String user_Name, double password, String email, String role_Id) {
		super();
		User_Id = user_Id;
		User_Name = user_Name;
		Password = password;
		Email = email;
		Role_Id = role_Id;
	}
	public String getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public double getPassword() {
		return Password;
	}
	public void setPassword(double password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getRole_Id() {
		return Role_Id;
	}
	public void setRole_Id(String role_Id) {
		Role_Id = role_Id;
	}
	
	public User() {
		
	}

}

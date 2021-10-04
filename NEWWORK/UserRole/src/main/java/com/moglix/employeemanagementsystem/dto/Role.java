package com.moglix.employeemanagementsystem.dto;

public class Role {
	
	private String Role_Id;
	private String Role_Name;

	public Role() {
		
	}
	

	
	public String addRole(Role role) {
		
		return "ROLE";
		
		
	}
	
	public Role(String role_Id, String role_Name) {
		super();
		Role_Id = role_Id;
		Role_Name = role_Name;
	}
	public String getRole_Id() {
		return Role_Id;
	}
	public void setRole_Id(String role_Id) {
		Role_Id = role_Id;
	}
	public String getRole_Name() {
		return Role_Name;
	}
	public void setRole_Name(String role_Name) {
		Role_Name = role_Name;
	}


}

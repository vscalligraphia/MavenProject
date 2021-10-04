package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.Role;

public class RoleDAO {
	
	private static int counter=0;
	
	Role roles[] = new Role[10];
	
	public String addRole(Role role) {

		
		if(counter<roles.length) {
			roles[counter++] = role;
			return "success";
		}
		
		else
			return "Array is full!!!!";
		
		
		
	}
	
	public Role getRoleById(String id) {
		for(Role role : roles) {
			if(role!=null && id.equals(role.getRole_Id())){
			return role;
			}
			
		}
		return null;	
		
	}
	
	private int getIndex(String id) {
		
		for(int i =0 ; i<roles.length;i++) {
			if(roles[i]!=null && roles[i].getRole_Id().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	//DELETE Role by Role ID
	public String deleteERoleById(String id) {
		
		int index=this.getIndex(id);
		if(index!=-1) {
			roles[index]=null;
		return "success";
		}
		else 
			return "not found";
	}
	
	// UPDATING Role
		public String updateRole(String id, Role role) {
			
			int index = this.getIndex(id);
			
			if(index!=-1) {
				
				roles[index]= role;
				return "Success";
			}
			else
				return "Not Found";
		}
	
	
		//DELETING ALL Roles
		public void deleteAllRole() {	
			roles= null;	
		}
	
	

	
	public RoleDAO() {
		// TODO Auto-generated constructor stub		
		}

	public Role[] getRoles() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}

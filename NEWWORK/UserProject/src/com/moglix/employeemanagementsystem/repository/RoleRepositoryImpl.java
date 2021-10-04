package com.moglix.employeemanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;
import com.moglix.employeemanagementsystem.dto.Role;

public class RoleRepositoryImpl implements RoleRepository {

	private RoleRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private static RoleRepository roleRepository;
	
    public static RoleRepository getInstance() {
	
		
		if(roleRepository == null)
		{
			roleRepository = new RoleRepositoryImpl();
			return roleRepository;
		}
		
		else
		{
			return roleRepository;
		}
		
	}

	//private static int counter=0;

	Role rolesa[] = new Role[10];
	
	private List<Role>  roles = new ArrayList<>();
	//private List<Role>  employees = new LinkedList<>();
	
	
	@Override
	public String addRole(Role role) {
		boolean result = roles.add(role);
		if(result) {
			return "Successeds";
			
		}
		else
			return "Failed";
	}



	@Override
	public Role getRoleById(String id) {
		

		for (Role role : roles) {
			if(id.equals(role.getRole_Id()))
				return role;
		}
		
		return null;
	}


	@Override
	public String deleteRoleById(String id) {
		
		Role role=this.getRoleById(id);
		if(role!=null) {
			if(roles.remove(role)) {
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
	public Role[] getRoles() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteAllRole() {
		// TODO Auto-generated method stub
		
	}
	

//
//	@Override
//	public List<Role> getRoles {
//		// TODO Auto-generated method stub
//		System.out.println("Hello");
//		return roles;
//	}

	
	public List<Role> getRoles1(){
		System.out.println("Hello");
		return roles;
		
	}
	
private int getIndex(String id1) {
		
		for(int i =0 ; i<rolesa.length;i++) {
			if(rolesa[i]!=null && rolesa[i].getRole_Id().equals(id1)) {
				return i;
			}
		}
		return -1;
	}


@Override
public String updateRole(String id, Role role) {
	
	int index = this.getIndex(id);
	
	if(index!=-1) {
		
		rolesa[index]= role;
		return "Success";
	}
	else
		return "Not Found";
	
	
}


	
/*private int getIndex(String id) {
		
		for(int i =0 ; i<roles.length;i++) {
			if(roles[i]!=null && roles[i].getRole_Id().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public String updateRole(String id, Role role) {
		int index = this.getIndex(id);
		
		if(index!=-1) {
			
			roles[index]= role;
			return "Success";
		}
		else
			return "Not Found";
	}

	@Override
	public Role getRoleById(String id) {
		for(Role role : roles) {
			if(role!=null && id.equals(role.getRole_Id())) {
			
			return role;
		    }	
			
		}
		
		return null;
		
	}

	@Override
	public Role[] getRoles() {
		return roles;
		
		
	}

	@Override
	public String deleteRoleById(String id) {
		int index=this.getIndex(id);
		if(index!=-1) {
			roles[index]=null;
		return "success";
		}
		else 
			return "not found";
	}

	@Override
	public void deleteAllRole() {
		// TODO Auto-generated method stub
		roles=null;
	}
*/
}

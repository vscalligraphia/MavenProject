package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.Role;
import com.moglix.employeemanagementsystem.repository.RoleDAO;
import com.moglix.employeemanagementsystem.repository.RoleRepository;

public class RoleService implements RoleServiceImpl{
	
	

	RoleDAO roleDAO	= new RoleDAO();
	
	RoleRepository roleRepository= RoleRepository.getInstance();

	//Reference
	private static RoleService  roleService;
	
	//Constructor
	
	//private Method
	public static RoleService getInstance() {
		
		if(roleService == null)
		{
			roleService = new RoleService();
			return roleService;
		}
		
		else
		{
			return roleService;
		}
		
		
	}
	
	

	public RoleService() {
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String addRole(Role role) {
		return roleDAO.addRole(role);
	}

	@Override
	public String updateRole(String id, Role role) {
		return roleDAO.updateRole(id, role);
	}

	@Override
	public Role getRoleyId(String id) {
		return roleDAO.getRoleById(id);
	}

	@Override
	public Role[] getRoles() {
		return roleDAO.getRoles();
	}

	@Override
	public String deleteRoleById(String id) {
		return roleDAO.deleteERoleById(id);
	}

	@Override
	public void deleteAllRole() {
		roleDAO.deleteAllRole();
	}
}

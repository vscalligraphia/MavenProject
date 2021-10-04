package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.Role;

public interface RoleRepository {

	public String addRole(Role role);
	public String updateRole(String id, Role role);
	public Role getRoleById(String id);
	public Role[] getRoles();
	public String deleteRoleById(String id);
	public void deleteAllRole();
	public RoleRepository getInstance();
	

}

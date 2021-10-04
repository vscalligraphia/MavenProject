package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.Role;

public interface RoleServiceImpl {
	

	public String addRole(Role role);
	public String updateRole(String id, Role role);
	public Role getRoleyId(String id);
	public Role[] getRoles();
	public String deleteRoleById(String id);
	public void deleteAllRole();
	

}

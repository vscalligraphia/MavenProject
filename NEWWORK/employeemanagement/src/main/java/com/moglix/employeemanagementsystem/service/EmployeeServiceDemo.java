package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;

public class EmployeeServiceDemo {
	
	EmployeeDAO employeeDAO	= new EmployeeDAO();
	
	public String addEmployee(Employee employee) {
		
		//service is consuming dao
		return employeeDAO.addEmployee(employee);
		
		
	}
	
	public String deleteEmployeeById(String id) {
		return employeeDAO.deleteEmployeeById(id);

		} 
	
	public Employee getEmployeeById(String empid) {
		return employeeDAO.getEmployeeById(empid);
	}
	
	
	
	
	
	
	
	
	
	public String updateEmployee(String empId, Employee employee) {
		
		return employeeDAO.updateEmployee("123",employee);
	}
	
	
	
	
	
	
	
	
	
	
	public Employee[] getEmployees() {
		return employeeDAO.geteEmployees();
		
	}
	
	public void deleteAllEmployees() {
		employeeDAO.deleteAllEmployees();
	}

}

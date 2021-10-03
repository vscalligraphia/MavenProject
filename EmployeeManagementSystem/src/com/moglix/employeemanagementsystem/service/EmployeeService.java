package com.moglix.employeemanagementsystem.service;

import java.util.List;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;
import com.moglix.employeemanagementsystem.repository.EmployeeRepository;
import com.moglix.employeemanagementsystem.repository.EmployeerepositoryImpl;

public class EmployeeService implements EmployeeServiceImpl {
	

	EmployeeDAO employeeDAO	= new EmployeeDAO();
	
	EmployeeRepository employeeRepository=EmployeerepositoryImpl.getInstance();

	//Reference
	private static EmployeeService employeeService;
	
	//Constructor
	private EmployeeService() {
		
	}
	
	//private Method
	public static EmployeeService getInstance() {
		
		if(employeeService == null)
		{
			employeeService = new EmployeeService();
			return employeeService;
		}
		
		else
		{
			return employeeService;
		}
		
		
	}
	
	
	
	@Override
	public String addEmpployee(Employee employee) {
		return  employeeRepository.addEmpployee(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		
		return  employeeRepository.updateEmployee("123",employee);
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) {
		return employeeRepository.deleteEmployeeById(id);
	}
	

	@Override
	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();

	}

}

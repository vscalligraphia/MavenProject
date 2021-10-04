package com.moglix.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;
import com.moglix.employeemanagementsystem.repository.EmployeeRepository;
import com.moglix.employeemanagementsystem.repository.EmployeerepositoryImpl;

@Component
public class EmployeeService implements EmployeeServiceImpl {
	
	
	//Here we need dao/repository object(Which is created by spring)
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	/*EmployeeRepository employeeRepository=EmployeerepositoryImpl.getInstance();

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
	
	*/
	
	@Override
	public String addEmpployee(Employee employee) {
		return  employeeDAO.addEmployee(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		
		return  employeeDAO.updateEmployee("123",employee);
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDAO.geteEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) {
		return employeeDAO.deleteEmployeeById(id);
	}
	

	@Override
	public void deleteAllEmployees() {
		employeeDAO.deleteAllEmployees();

	}

}

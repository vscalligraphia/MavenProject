package com.moglix.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeRepository;
@Service //it will implement serviceImpl 
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public String addEmpployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.addEmpployee(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.updateEmployee(id, employee);
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteAllEmployees();
	}

}

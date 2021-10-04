package com.moglix.employeemanagementsystem.repository;

import com.moglix.employeemanagementsystem.dto.Employee;

public class EmployeeDAO {
	
	private static int counter=0;
	
	Employee employees[] = new Employee[10];
	
	public String addEmployee(Employee employee) {
		
		if(counter<employees.length) {
			
			employees[counter++] = employee;
			return "success";
		}
		
		else
			return "Array is full!!!!";
		
	}
	
	public Employee getEmployeeById(String id) {
		
		for(Employee employee : employees) {
			if(employee!=null && id.equals(employee.getEmpID())) {
			
			return employee;
		    }	
			
		}
		
		return null;
		
	}
	

	public Employee[] geteEmployees() {
		return employees;
	}

	
	private int getIndex(String id) {
		
		for(int i =0 ; i<employees.length;i++) {
			if(employees[i]!=null && employees[i].getEmpID().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	//DELETE EMPLOYEE BY EMPLOYEE ID
	public String deleteEmployeeById(String id) {
		//Employee employee = this.getEmployeeById(id);
		
		int index=this.getIndex(id);
		if(index!=-1) {
			employees[index]=null;
		return "success";
		}
		else 
			return "not found";
	}
	
	// UPDATING EMPLOYEE
	public String updateEmployee(String id, Employee employee) {
		
		int index = this.getIndex(id);
		
		if(index!=-1) {
			
			employees[index]= employee;
			return "Success";
		}
		else
			return "Not Found";
	}
	

	//DELETING ALL EMPLOYEE
	public void deleteAllEmployees() {	
		employees= null;	
	}
}
	

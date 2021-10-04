package com.moglix.employeemanagmentsystem;

import java.util.TreeSet;

import com.moglix.employeemanagementsystem.dto.Employee;

public class Main3 {
	
 public static void main(String[] args) {
	 
	 
	 
	 TreeSet<Employee> employees=new TreeSet<>();
		
		Employee employee = new Employee("234","Vishal","SAini",1000.4f);
		
		Employee employee2 = new Employee("167","Yes","Sweni",1012.7f);
		
		Employee employee3 = new Employee("456","Shal","Isini",1000.9f);
		
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
			
		
		//employees.remove(employee3);
		
		//employees.clone();
//		HashSet<Employee> employees1= (HashSet<Employee>) employees.clone();
//		System.out.println(employees1);
//		
	//	employees.size();
		
		
		boolean result=employees.contains(employee3);
		System.out.println(result);
		System.out.println(employees);
}

}

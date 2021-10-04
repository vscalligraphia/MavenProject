package com.moglix.employeemanagmentsystem;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.service.EmployeeService;
import com.moglix.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {

		//service object
		//1.via getBean method
		
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext();
		
		//Spring 2 config Annotation based
		//xml based===>.xml===> config===>till spring 3.0===>4.0
		
		EmployeeService employeeService= applicationContext.getBean(EmployeeService.class);
		
		Employee employee=new Employee("Vishal",100,"DElhi");
		//employee object
		
		String result= 
		
		
		
		Employee employee = new Employee();

		// EmployeeServiceDemo employeeServiceDemo = new EmployeeServiceDemo();

		EmployeeServiceImpl employeeServiceDemo = EmployeeService.getInstance();

		employee.setEmpID("123");
		employee.setEmpFirstName("Vishal");
		employee.setEmpLastname("Saini");
		employee.setEmpSalary(100000);
		employee.setPanCard("IYMPS77232");
		employee.setAadhar("123456332");
		employee.setAddress("H>NO>100");

		System.out.println(employee.getEmpID());
		System.out.println(employee.getEmpSalary());

		
		  
		  String result = employeeServiceDemo.addEmpployee(employee);
		  System.out.println(result);
		 
//		  List<Employee> yut = ;
//		  
//		  String result2=EmployeeServiceImpl.deleteEmployeeById("123");
//		  System.out.println(result2); 
//		  
		  
		  
		  
		  
		  
		  
		  
		  
		  String result2= employeeServiceDemo.deleteEmployeeById("123");
		  System.out.println(result2+"\nDELETED");
		  
		 

		Employee employee2 = employeeServiceDemo.getEmployeeById("123");

		if (employee2 == null) {

			System.out.println("Not Exists");

		}

		else {
			System.out.println("EXISTS");
		}

		List<Employee> employees = employeeServiceDemo.getEmployees();
		
		
		System.out.println("EMPLoYEE");
		for (Employee employee3 : employees) {
			if (employee3 != null) {
				System.out.println(employee3);
				System.out.println(employee3.toString());
			}
		}

		// employeeService.deleteAllEmployees();

		String updateStatus = employeeServiceDemo.updateEmployee("Vissss", employee);
		System.out.println(updateStatus);

	}

}

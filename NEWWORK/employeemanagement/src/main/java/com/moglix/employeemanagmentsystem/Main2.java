package com.moglix.employeemanagmentsystem;

import com.moglix.employeemanagementsystem.dto.Manager;
import com.moglix.employeemanagementsystem.dto.Employee;

public class Main2 {
	
	public final int abcds;
	
	public Main2() {
	abcds=10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Manager manager = new Manager();
		
		Manager man = new Manager("123","ABC","DEF",1239.0, "ABCED",0.0f);
		System.out.println(man);
		System.out.println(man.calculatesalary());
		
		Employee manager = new Manager();
		System.out.println(manager);
		
		
	}

}

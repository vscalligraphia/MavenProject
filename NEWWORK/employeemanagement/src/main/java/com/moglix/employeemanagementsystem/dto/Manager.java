package com.moglix.employeemanagementsystem.dto;

public class Manager extends Employee {
	private String projectName;
	private float projectAllowance;
	
	
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getProjectAllowance() {
		return projectAllowance;
	}
	public void setProjectAllowance(float projectAllowance) {
		this.projectAllowance = projectAllowance;
	}
	
	
	public Manager() {
		super("123","VISHU","Saini",100.01f);
		//super method is used to give a call to base class constructor
//		super method must be 1st call
		//super method will not return anything
							
		System.out.println("HELLO FROM MANAGER");
		
	}
	
	
	public Manager(String empID, String empFirstName, String empLastname, double empSalary, String projectName,float projectAllowance) {
		super(empID, empFirstName, empLastname, empSalary);
		this.projectName = projectName;
		this.projectAllowance=projectAllowance;
		System.out.println("HIi");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"Manager [projectName=" + projectName + ", projectAllowance=" + projectAllowance + "]";
	}
	
	
	
	
	@Override
	public float calculatesalary() {
		// TODO Auto-generated method stub
		return super.calculatesalary()+this.projectAllowance;
	}
	

}

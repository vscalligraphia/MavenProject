package com.moglix.employeemanagementsystem.dto;

public class Employee implements Comparable<Employee>{
	
	
	private String empID;
	private String empFirstName;
	private String empLastname;
	private double empSalary;
	private String Address;
	private String PanCard;
	private String aadhar;
	
	
	
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastname=" + empLastname
				+ ", empSalary=" + empSalary + ", Address=" + Address + ", PanCard=" + PanCard + ", aadhar=" + aadhar
				+ "]";
	}
	
	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastname() {
		return empLastname;
	}
	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPanCard() {
		return PanCard;
	}
	public void setPanCard(String panCard) {
		PanCard = panCard;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	
	//generate own constructor using priorities in id,name,salary
	public Employee(String empID, String empFirstName, String empLastname, double empSalary) {
		super();
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastname = empLastname;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		System.out.println("HELLO INSIDE EMPLOYEE");
		
		// TODO Auto-generated constructor stub
	}


	float basicSalary;
	float hra;
	float da;
	float ta; 
	float TotalSalary;
	
	
	public float calculatesalary() {
		float hra=(float) ((10*empSalary)/100);
		float ta=(float) ((10*empSalary)/100);
		float da=(float) ((10*empSalary)/100);
		float netsalary=(float) (hra+ta+da+empSalary);
		return netsalary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empID.compareTo(o.getEmpID());
	}
	
	
	
	
	}

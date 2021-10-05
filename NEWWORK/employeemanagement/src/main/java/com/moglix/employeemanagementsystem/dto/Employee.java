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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((PanCard == null) ? 0 : PanCard.hashCode());
		result = prime * result + Float.floatToIntBits(TotalSalary);
		result = prime * result + ((aadhar == null) ? 0 : aadhar.hashCode());
		result = prime * result + Float.floatToIntBits(basicSalary);
		result = prime * result + Float.floatToIntBits(da);
		result = prime * result + ((empFirstName == null) ? 0 : empFirstName.hashCode());
		result = prime * result + ((empID == null) ? 0 : empID.hashCode());
		result = prime * result + ((empLastname == null) ? 0 : empLastname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(empSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(hra);
		result = prime * result + Float.floatToIntBits(ta);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (PanCard == null) {
			if (other.PanCard != null)
				return false;
		} else if (!PanCard.equals(other.PanCard))
			return false;
		if (Float.floatToIntBits(TotalSalary) != Float.floatToIntBits(other.TotalSalary))
			return false;
		if (aadhar == null) {
			if (other.aadhar != null)
				return false;
		} else if (!aadhar.equals(other.aadhar))
			return false;
		if (Float.floatToIntBits(basicSalary) != Float.floatToIntBits(other.basicSalary))
			return false;
		if (Float.floatToIntBits(da) != Float.floatToIntBits(other.da))
			return false;
		if (empFirstName == null) {
			if (other.empFirstName != null)
				return false;
		} else if (!empFirstName.equals(other.empFirstName))
			return false;
		if (empID == null) {
			if (other.empID != null)
				return false;
		} else if (!empID.equals(other.empID))
			return false;
		if (empLastname == null) {
			if (other.empLastname != null)
				return false;
		} else if (!empLastname.equals(other.empLastname))
			return false;
		if (Double.doubleToLongBits(empSalary) != Double.doubleToLongBits(other.empSalary))
			return false;
		if (Float.floatToIntBits(hra) != Float.floatToIntBits(other.hra))
			return false;
		if (Float.floatToIntBits(ta) != Float.floatToIntBits(other.ta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastname=" + empLastname
				+ ", empSalary=" + empSalary + ", Address=" + Address + ", PanCard=" + PanCard + ", aadhar=" + aadhar
				+ "]";
	}
	
	public String getEmpID() {
		return empID;
	}

	public String setEmpID(String empID) {
		return this.empID = empID;
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

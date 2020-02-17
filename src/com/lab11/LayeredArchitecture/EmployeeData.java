package com.lab11.LayeredArchitecture;

public class EmployeeData {
	String name;
	Double salary;
	int employeeId;
	String Designation;
	EmployeeData(String name,Double salary,int employeeId,String Designation)
	{
		this.name=name;
		this.salary=salary;
		this.employeeId=employeeId;
		this.Designation=Designation;
	}
	public String toString()
	{
		return Designation;
	}

}

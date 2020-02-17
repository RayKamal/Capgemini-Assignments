package com.lab5.exercise6;

public class Employee {
	String NameOfEmployee;
	float Salary;
	Employee(String name,float sal) 
	{
		NameOfEmployee=name;
		Salary=sal;
	}
	public void SalaryDetails() throws UserDefineException
	{
		System.out.println("employee details :\n"+"name :"+NameOfEmployee+"\n"+"salary :"+Salary);
		if(Salary<3000)
				throw new UserDefineException(Salary);
	}

}

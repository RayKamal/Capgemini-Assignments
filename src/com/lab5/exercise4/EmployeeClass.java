package com.lab5.exercise4;



public class EmployeeClass {
	String FirstName;
	String LastName;
	EmployeeClass(String firstName,String lastName)
	{
		FirstName=firstName;
		LastName=lastName;
	}
	public  void employeeName() throws UserDefineException
	{
		if(FirstName.isEmpty() && LastName.isEmpty())
			throw new UserDefineException();
		System.out.println("Your name is "+FirstName+ " "+LastName );
	}

}

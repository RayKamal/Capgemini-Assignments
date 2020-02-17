package com.lab5.exercise5;

public class AgeClass {
	int age;
	AgeClass(int Age)
	{
		age=Age;
	}
	public  void employeeAge() throws UserDefineException
	{
		if(age<15)
			throw new UserDefineException(age);
		System.out.println("Your age is "+age+ " your are eligible for this event");
	}
}

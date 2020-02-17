package com.lab5.exercise5;

public class UserDefineException extends Exception {
	
	private int Age;
	UserDefineException(int age)
	{
	   Age=age;	
	}
	
    public String toString()      {
       return "UserDefineException["+"User age is below 15 years"+"]";
    }

}

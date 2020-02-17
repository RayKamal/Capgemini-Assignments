package com.lab5.exercise6;

public class UserDefineException extends Exception {
	private float salary;
	UserDefineException(float sal)
	{
	   salary=sal;	
	}
	
    public String toString()      {
       return "UserDefineException["+"Employee salary is below 3000 rupee"+"]";
    }
}

package com.lab5.exercise4;

import java.util.Scanner;

import com.lab5.exercise5.UserDefineException;

public class FinalClass {
	public static void main(String ar[]) throws com.lab5.exercise4.UserDefineException
	{
		String firstName="";
		String lastName="";
		/*Scanner sc=new Scanner(System.in);
		firstName=sc.next();
		lastName=sc.next();*/
		EmployeeClass ec=new EmployeeClass(firstName,lastName);
		ec.employeeName();
	   /* try {
			ec.employeeName();
		} catch (com.lab5.exercise4.UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}

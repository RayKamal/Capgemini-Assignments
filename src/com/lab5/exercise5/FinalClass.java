package com.lab5.exercise5;

import java.util.Scanner;

public class FinalClass {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int Age=sc.nextInt();
		try {
			AgeClass ac=new AgeClass(Age);
			ac.employeeAge();
		} catch (UserDefineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

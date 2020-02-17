package com.lab5.exercise3;

import java.util.Scanner;

public class FinalClass {

	public static void main(String ar[])
	{
		int Number;
		Scanner sc=new Scanner(System.in);
		Number=sc.nextInt();
		PrimeClass pc=new PrimeClass(Number);
		pc.primeNumberInRange();
	}
}

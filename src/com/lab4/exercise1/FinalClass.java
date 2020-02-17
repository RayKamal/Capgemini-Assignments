package com.lab4.exercise1;

import java.util.Scanner;


public class FinalClass {
	public static void main(String ar[])
	{
	int naturalNumber;
	Scanner sc=new Scanner(System.in);
	naturalNumber=sc.nextInt();
	SumCube sum=new SumCube(naturalNumber);
	int Sum=(int) sum.cubeSum();
	System.out.println(Sum);
	
	}
}

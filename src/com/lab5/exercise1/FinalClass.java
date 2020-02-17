package com.lab5.exercise1;

import java.util.Scanner;

public class FinalClass {

	public static void main(String ar[])
	{
		String signal;
		Scanner sc=new Scanner(System.in);
		signal=sc.next();
	
			 SwitchClass swc=new SwitchClass(signal);
				swc.trafficLight();
	}
}

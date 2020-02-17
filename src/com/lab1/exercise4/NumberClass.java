package com.lab1.exercise4;

public class NumberClass {
	int Number;
	
	
	public NumberClass(int number) {
		Number=number;
	}

	

	public boolean checkNumber()
	{
		while(Number%2==0)
		{
			Number=Number/2;
		}
		
		if(Number==1)   //2^0=1
		{
			return true;
		}
		else
			return false;
		
	}

}

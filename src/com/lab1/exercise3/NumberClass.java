package com.lab1.exercise3;

public class NumberClass {
	int Number;
	int rem; //operational argument
	int num;
	
	public NumberClass(int number) {
		Number=number;
	}

	

	public boolean checkNumber()
	{
		rem=0;
		num=Number%10;
		while(Number!=0)
		{
			
			rem=Number%10;
			if(!(num>=rem))
				break;
			num=rem;
			Number=Number/10;
			
		}
		if(Number==0)
		{
			return true;
		}
		else
		return false;
		
	}

}

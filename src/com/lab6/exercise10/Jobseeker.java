package com.lab6.exercise10;

public class Jobseeker {
	public boolean validateName(String name)
	{
		int len;
		len=name.length();
		if(name.length()<8)
			return false;
		else if(name.charAt(len-1)=='b'&&name.charAt(len-2)=='o'&&name.charAt(len-3)=='j'&&name.charAt(len-4)=='_')
		{
			if(len-4==8)
				return true;
			
			return false;
		}
		return false;
		
	}

}

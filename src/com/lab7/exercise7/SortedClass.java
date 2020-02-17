package com.lab7.exercise7;

import java.util.Arrays;

public class SortedClass {
	public static int[] getSorted(int intArray[])
	{
		
		for(int intindex=0;intindex<intArray.length;intindex++)
		{
			StringBuilder st=new StringBuilder();
			String s;
			st.append(intArray[intindex]);
			//System.out.println(st);
			st.reverse();
			//System.out.println(st);
			s=st.toString();
			//System.out.println(s);
			//System.out.println(st);
			intArray[intindex]=Integer.parseInt(s);
			//System.out.println(intArray[intindex]);
			//System.out.println(s);
		}
		Arrays.sort(intArray);
		return intArray;
	}
	
	public static void main(String ar[])
	{
		int intArray[]= {123,234,312,2345,234,12,1};
		int intArray1[]=getSorted(intArray);
		for(int i=0;i<intArray1.length;i++)
		{
			System.out.println(intArray1[i]);
		}
		
	}

}

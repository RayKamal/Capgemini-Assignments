package com.lab5.exercise6;

public class FinalClass  {
	public static void main(String ar[]) throws UserDefineException {
		Employee ec=new Employee("satyam",2000f);
		Employee ec1=new Employee("shivam",5000f);
		try {
			
			ec.SalaryDetails();
			
		} catch (UserDefineException e) {
			System.out.println("caught  "+e);
			ec1.SalaryDetails();
        }

}

}
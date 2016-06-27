package com.mpp.hr;

public abstract class Employee {
	private int employeeID;
	
	/*public PayCheck calcCompensation(){
		return new PayCheck(grossPay, fica, state, medicare, socialSecurity, payPeriad);
	}*/
	
	public abstract double calcGrossPay();
	
	public String print(){
		String output = "";
		return output;
	}

}

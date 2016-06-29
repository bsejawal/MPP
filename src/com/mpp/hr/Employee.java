package com.mpp.hr;

public abstract class Employee {
	private int employeeID;	

	public Employee(int employeeID) {
		this.employeeID = employeeID;
	}

	/*
	 * public PayCheck calcCompensation(){ return new PayCheck(grossPay, fica,
	 * state, medicare, socialSecurity, payPeriad); }
	 */

	public int calcCompensation(int year, int month) {

		// return new PayCheck(grossPay, fica, state, medicare, socialSecurity,
		// payPeriad);
		calcGrossPay();
		return 0;
	}

	public abstract double calcGrossPay();

	public String print() {
		String output = "";
		return output;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

}

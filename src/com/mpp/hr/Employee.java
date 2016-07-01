package com.mpp.hr;

import java.util.GregorianCalendar;

public abstract class Employee {
	private int employeeID;

	public Employee(int employeeID) {
		this.employeeID = employeeID;
	}

	public PayCheck calcCompensation(int year, int month) {
		double grossPay = calcGrossPay();
		
		return new PayCheck(grossPay, getFica(grossPay), getState(grossPay), getLocal(grossPay), getMedicare(grossPay), getSocialSecurity(grossPay), new DateRange(new GregorianCalendar(2016, 6, 2), new GregorianCalendar(2016, 7,23)));
		
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

	private double getFica(double grossPay) {
		return (double) (grossPay * 25 / 100);
	}

	private double getState(double grossPay) {
		return (double) (grossPay * 5 / 100);
	}

	private double getLocal(double grossPay) {
		return (double) (grossPay * 1 / 100);
	}

	private double getMedicare(double grossPay) {
		return (double) (grossPay * 3 / 100);
	}

	private double getSocialSecurity(double grossPay) {
		return (double) (grossPay * 7.5 / 100);
	}

}

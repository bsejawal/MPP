package com.mpp.hr;

public class SalariedEmployee extends Employee {
	private double salary;
	
	

	public SalariedEmployee(int employeeID, double salary) {
		super(employeeID);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return 0;
	}

}

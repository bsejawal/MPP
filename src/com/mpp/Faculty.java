package com.mpp;

public class Faculty extends Person {
	
	double salary;
	
	
	
	public Faculty(String name, String phone, int age, double salary) {
		super(name, name, age);
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	int getTotalUnits(){
		return 0;
	}

}

package com.mpp.hr;

public class HourlyEmployee extends Employee {

	private double hourlyWages;
	private int hoursPerWeek;

	public HourlyEmployee(int employeeID,  double hourlyWages, int hoursPerWeek) {
		super(employeeID);
		this.hourlyWages = hourlyWages;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(double hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
}
package com.mpp.hr;

public class PayCheck {
	private static final double FICA = 25;
	private static final double STATE = 5;
	private static final double MEDICARE = 3;
	private static final double SOCIALSECURITY = 7.5;

	private DateRange payPeriad;
	private double grossPay;

	public PayCheck(double grossPay, DateRange payPeriad) {
		this.grossPay = grossPay;
		this.payPeriad = payPeriad;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public DateRange getPayPeriad() {
		return payPeriad;
	}

	public double getNetPay() {
		return 0.0;

	}
	
	public double getActualPay(){
		return 0.0;
		
	}

	public String print() {
		String output = "";
		return output;
	}

}

package com.mpp.hr;

public class PayCheck {
	private static final double FICA = 25;
	private static final double STATE = 5;
	private static final double LOCAL = 1;
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
		double fica = grossPay * FICA / 100;
		double state = grossPay * STATE / 100;
		double local = grossPay * LOCAL / 100;
		double medicare = grossPay * MEDICARE / 100;
		double socialSecurity = grossPay * SOCIALSECURITY / 100;
		return grossPay - fica - local - state - medicare - socialSecurity;
	}

	public String print() {
		String output = "";
		return output;
	}

}

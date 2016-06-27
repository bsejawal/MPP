package com.mpp.hr;

public class PayCheck {
	private double grossPay;
	private double fica; // 25%
	private double state; // 5%
	private double medicare; // 3%
	private double socialSecurity; // 7.5 %
	private DateRange payPeriad;
	
//	FICA is 23%
//	State tax is 5%
//	Local tax is 1%
//	Medicare is 3%
//	Social Security is 7.5%

	
	
	public PayCheck(double grossPay, double fica, double state, double medicare, double socialSecurity,
			DateRange payPeriad) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriad = payPeriad;
	}


	public double getGrossPay() {
		return grossPay;
	}


	public double getFica() {
		return fica;
	}


	public double getState() {
		return state;
	}


	public double getMedicare() {
		return medicare;
	}


	public double getSocialSecurity() {
		return socialSecurity;
	}


	public DateRange getPayPeriad() {
		return payPeriad;
	}


	public double getNetPay(){
		return 0.0;
		
	}
	
	
	public String print(){
		String output = "";
		return output;
	}

}

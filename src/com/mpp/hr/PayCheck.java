package com.mpp.hr;

public class PayCheck {
	private double grossPay;
	private double fica; // = 25;
	private double state; // = 5;
	private double local; // = 1;
	private double medicare; // = 3;
	private double socialSecurity; // = 7.5;
	private DateRange payPeriad;

	public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriad) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriad = payPeriad;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getFica() {
		return fica;
	}

	public void setFica(double fica) {
		this.fica = fica;
	}

	public double getState() {
		return state;
	}

	public void setState(double state) {
		this.state = state;
	}

	public double getLocal() {
		return local;
	}

	public void setLocal(double local) {
		this.local = local;
	}

	public double getMedicare() {
		return medicare;
	}

	public void setMedicare(double medicare) {
		this.medicare = medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(double socialSecurity) {
		this.socialSecurity = socialSecurity;
	}

	public DateRange getPayPeriad() {
		return payPeriad;
	}

	public void setPayPeriad(DateRange payPeriad) {
		this.payPeriad = payPeriad;
	}

	public String print() {
		String output = "";
		return output;
	}

}

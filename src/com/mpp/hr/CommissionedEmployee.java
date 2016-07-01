package com.mpp.hr;

import java.util.ArrayList;
import java.util.Iterator;

public class CommissionedEmployee extends Employee {
	public static final int COMISSIONPERCENTAGE = 7;
	private double baseSalary;
	private ArrayList<Order> orders = new ArrayList<Order>();

	public CommissionedEmployee(int employeeID, double baseSalary) {
		super(employeeID);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public double getCommission() {

		double commissionAmount = 0;

		Iterator<Order> it = orders.iterator();
		while (it.hasNext()) {
			Order order = it.next();
			commissionAmount += order.getOrderAmount() * COMISSIONPERCENTAGE / 100;
		}
		return commissionAmount;
	}

	@Override
	public double calcGrossPay() {
		return baseSalary +  getCommission();
	}

}

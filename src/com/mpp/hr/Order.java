package com.mpp.hr;

import java.util.GregorianCalendar;

public class Order {
	private int orderNo;
	private GregorianCalendar orderDate;
	private double orderAmount;

	public Order(int orderNo, GregorianCalendar orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public GregorianCalendar getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(GregorianCalendar orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

}

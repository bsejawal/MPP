package com.mpp.hr;

import java.util.Date;

public class Order {
	private int orderNo;
	private Date orderDate;
	private double orderAmount;

	public Order(int orderNo, Date orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

}

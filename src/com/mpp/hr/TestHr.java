package com.mpp.hr;

import java.util.Date;

public class TestHr {
	public static void main(String[] args) {
		// DateRange dr = new DateRange(new Date(), new Date());
		// System.out.println("output \n");
		Employee employee = new HourlyEmployee(1457, 20, 40);
		System.out.println("Hourly Employee : "+employee.calcCompensation(0, 1).print());
		
		CommissionedEmployee commissionedEmployee = new CommissionedEmployee(125, 3000);
		commissionedEmployee.addOrder(new Order(145, new Date(), 4587));
		commissionedEmployee.addOrder(new Order(144, new Date(), 4758));
		commissionedEmployee.addOrder(new Order(142, new Date(), 5689));
		employee = commissionedEmployee;
		
		System.out.println("comissioned employee" + employee.calcCompensation(0, 1).print());
		
		
		
		
//		System.out.println(DateRange.getLastDayOfMonth("1/01/2016"));
	}

}

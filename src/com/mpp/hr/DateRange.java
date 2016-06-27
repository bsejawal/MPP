package com.mpp.hr;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateRange {

	private static final SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	private Date startDate;
	private Date endDate;

	private long diff;

	public DateRange(Date startDate, Date endData) {
		this.startDate = startDate;
		this.endDate = endData;
		diff = this.endDate.getTime() - this.startDate.getTime();
	}

	public DateRange(String startDate, String endData) {
		try {
			this.startDate = format.parse(startDate);
			this.endDate = format.parse(endData);
			diff = this.endDate.getTime() - this.startDate.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean isInRange() {

		return false;
	}

	public static int getFirstDayOfMonth(Date date) {
		return 1;
	}

	public static int getLastDayOfMonth(Date date) {
		// Date today = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		
	}

	@Override
	public String toString() {
		return "Start Date " + startDate + ", End Date : " + endDate;
	}

}

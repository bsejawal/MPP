package com.mpp.hr;

import java.text.DateFormat;
import java.text.ParseException;
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
		this.setDiff(this.endDate.getTime() - this.startDate.getTime());
	}

	public DateRange(String startDate, String endData) {
		try {
			this.startDate = format.parse(startDate);
			this.endDate = format.parse(endData);
			setDiff(this.endDate.getTime() - this.startDate.getTime());
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

	public static int getLastDayOfMonth(String dateInString) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date newDate = null;
		try {
			newDate = formatter.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(newDate);
		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		Date lastDayOfMonth = calendar.getTime();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return Integer.parseInt(sdf.format(lastDayOfMonth).toString().split("-")[2]);
	}

	@Override
	public String toString() {
		return "Start Date " + startDate + ", End Date : " + endDate;
	}

	public long getDiff() {
		return diff;
	}

	public void setDiff(long diff) {
		this.diff = diff;
	}

}

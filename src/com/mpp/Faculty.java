package com.mpp;

import java.util.ArrayList;
import java.util.Iterator;

public class Faculty extends Person {

	double salary;
	private ArrayList<Course> courses = new ArrayList<Course>();

	public Faculty(String name, String phone, int age, double salary) {
		super(name, name, age);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTotalUnits() {
		int units = 0;
		Iterator<Course> it = courses.iterator();
		while (it.hasNext()) {
			Course course = it.next();
			units += course.getUnit();
		}
		return units;

	}

	public void addCourse(Course course) {
		courses.add(course);
	}

}

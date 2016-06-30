package com.mpp.school;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Person {
	private ArrayList<Course> courses = new ArrayList<Course>();
	private double gpa;


	public Student(String name, String phone, int age, double d) {
		super(name, phone, age);
		this.gpa = d;
		}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void addCourse(Course course){
		courses.add(course);
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

	
}

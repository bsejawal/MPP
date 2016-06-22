package com.mpp;

public class Student extends Person {
	
	float gpa;


	public Student(String name, String phone, int age, float d) {
		super(name, phone, age);
		this.gpa = d;
		}
	
	int getTotalUnit(){
		return 1;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	
	
}

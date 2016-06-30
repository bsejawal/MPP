package com.mpp.dept;

import java.util.ArrayList;
import java.util.Iterator;

public class Department {

	private String name;
	
	private ArrayList<Person> list;
	
	
	public Department(String name, ArrayList<Person> list) {
		this.name = name;
		this.list = list;
	}

	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}
	
	public void addPerson(Person p) {
		list.add(p);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double getTotalSalary() {
		double totalSal = 0.0;
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person person = it.next();

			if (person instanceof Staff || person instanceof Faculty) {
				totalSal += person.getSalary();
			}
		}
		return totalSal;
	}

	

	public String showAllMembers() {
		String output = "";
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person person = it.next();
			output += "Name : " + person.getName();
			output += ", Phone: " + person.getPhone();
			output += ", Age :" + person.getAge();
			output += ", Type :" + getType(person);
			output += "\n";
		}
		return output;
	}

	public String getType(Person person) {
		if (person instanceof Staff)
			return "Staff";
		else if (person instanceof Student)
			return "Student";
		else if (person instanceof Faculty)
			return "Faculty";
		return "Person";

	}

	public String unitPerFaculty() {
		String output = "";
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			if (getType(p).equalsIgnoreCase("Faculty")) {
				Faculty f = (Faculty) p;
				output += f.getName() + " : " + f.getTotalUnits() + "\n";
			}
		}
		return output;
	}
	
	
	public String unitPerStudent(){
		String output = "";
		Iterator<Person> it = list.iterator();
		while(it.hasNext()){
			Person p = it.next();
			if(getType(p).equalsIgnoreCase("Student")){
				Student s = (Student) p;
				output += s.getName() +" : " + s.getTotalUnits() +"\n";
			}
		}
		return output;
	}
}

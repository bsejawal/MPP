package com.mpp;

import java.util.ArrayList;
import java.util.Iterator;

public class Department {
	
	private String name;
	private ArrayList<Person> list = new ArrayList<Person>();
	
	double getTotalSalary(){
		double totalSal=0.0;
		Iterator<Person> it  = list.iterator();
		while(it.hasNext()){
			Person person = it.next();
			
			if(person instanceof Staff || person instanceof Faculty){
				totalSal += person.getSalary();
			}	
		}
		return totalSal;
	}
	
	public void addPerson(Person p){
		list.add(p);		
	}
	
	public String showAllMembers(){
		String output = "";
		Iterator<Person> it = list.iterator();
		while(it.hasNext()){
			Person person = it.next();			
			output += "Name : "+person.getName();
			output += ", Phone: "+person.getPhone();
			output += ", Age :"+person.getAge();
			output +=", Type :"+getType(person) ;
			if(getType(person) == "Faculty"){
				Faculty f = (Faculty) person;
				output += ", Total Unit : "+f.getTotalUnits();
			}
			output += "\n";
		}
		return output;
	}
	
	public String getType(Person person){
		if(person instanceof Staff) return "Staff";
		else if (person instanceof Student) return "Student";
		else if (person instanceof Faculty) return "Faculty";
		return "Person";
		
	}

}

package com.mpp;

import java.util.ArrayList;
import java.util.Iterator;

public class Department {
	
	String name;
	ArrayList<Person> list = new ArrayList<Person>();
	
	double getTotalSalary(){
		double totalSal=0.0;
		Iterator<Person> it  = list.iterator();
		/*while(it.hasNext()){
			
			
			if(it instanceof Staff){
				Staff s = (Staff) it;
				totalSal += s.getSalary();
			}else if(it instanceof Faculty){
				Faculty f = (Faculty) it;
				totalSal += f.getSalary();
			}
				
		}*/
		return totalSal;
	}
	
	public void addPerson(Person p){
		list.add(p);		
	}
	
	int shouwAllMembers(){
		return 0;
	}
	

}

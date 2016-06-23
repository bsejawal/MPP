package com.mpp;

import java.util.ArrayList;

public class DeptImp {

	public static void main(String[] args) {

			Department computer = new Department("Computer",new ArrayList<Person>());
			//faculties on computer department
			Faculty f1 = new Faculty("Frank Moore", "472-5921", 43, 10000.00);
			computer.addPerson(f1);
			Faculty f2 = new Faculty("Sam Howard", "472-7222", 55, 9500.00);
			computer.addPerson(f2);			
			Faculty f3 = new Faculty("John Doodle", "472-6190", 39, 8600.00);
			computer.addPerson(f3);

			//Student on Computer Department
			Student s1 = new Student("John Doe", "472-1121", 22, 4.0);
			computer.addPerson(s1);
			
			
			
			
			f1.addCourse(new Course("1", "MPP", 4));
			f1.addCourse(new Course("2", "FPP", 5));
			f1.addCourse(new Course("3", "Algorithm", 5));
			d.addPerson(f1);
			Faculty f2 = new Faculty("Raj", "5896784", 56, 458745.01);
			d.addPerson(f2);
			f2.addCourse(new Course("25", "DBA", 6));
			f2.addCourse(new Course("27", "Algorithm", 7));
			
			
			
			d.addPerson(new Staff("Hari", "256984", 29, 12000.256));
			/*Student s1 = new Student("Shyam", "12589963", 28, (float)3.75);
			d.addPerson(s1);
			s1.addCourse(new Course("5", "FPP", 3));
			s1.addCourse(new Course("6", "MPP", 4));
			s1.addCourse(new Course("7", "DBA", 5));*/
			d.addPerson(new Staff("Hari", "256984", 29, 13000.256));
			System.out.println("unitPerFaculty : \n"+d.unitPerFaculty());
			System.out.println("unitPerStudent : \n"+d.unitPerStudent());
//			System.out.println("==> "+d.getTotalSalary());
//			System.out.println(d.showAllMembers());
			

			
	}

}

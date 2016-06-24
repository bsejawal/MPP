package com.mpp;

import java.util.ArrayList;

public class DeptImp {

	public static void main(String[] args) {

			Department computer = new Department("Computer",new ArrayList<Person>());
			//faculties on computer department
			Faculty frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000.00);
			computer.addPerson(frankMoore);
			Faculty samHoward = new Faculty("Sam Howard", "472-7222", 55, 9500.00);
			computer.addPerson(samHoward);			
			Faculty johnDoodle = new Faculty("John Doodle", "472-6190", 39, 8600.00);
			computer.addPerson(johnDoodle);

			//Student on Computer Department
			Student johnDoe = new Student("John Doe", "472-1121", 22, 4.0);
			computer.addPerson(johnDoe);
			Student maryJones = new Student("Mary Jones","472-7322", 32, 3.80);
			computer.addPerson(maryJones);
			Student leeJohnson = new Student("Lee Johnson", "472-6009", 19, 3.65);
			computer.addPerson(leeJohnson);
			
			//Staff on Computer Department
			Staff frankGore = new Staff("Frank Gore", "472-3321", 33, 4050);
			computer.addPerson(frankGore);
			Staff adamDavis = new Staff("Adam Davis", "472-7552", 50, 5500);
			computer.addPerson(adamDavis);
			Staff davidHeck = new Staff("David Heck", "472-8890", 29, 3600);
			computer.addPerson(davidHeck);
			
			
			//Adding faculty course
			Course CS201 = new Course("CS201","Programming 1", 4);
			johnDoodle.addCourse(CS201);
			Course CS360 = new Course("CS360","Databases", 3);
			samHoward.addCourse(CS360);
			Course CS404 = new Course("CS404","Compilers", 4);
			johnDoodle.addCourse(CS404);
			Course CS240 = new Course("CS240","Data structures", 2);
			johnDoodle.addCourse(CS240);
			Course CS301 = new Course("CS301","Software Engineering", 3);
			samHoward.addCourse(CS301);
			Course CS450 = new Course("CS450","Advanced Architecture", 5);
			johnDoodle.addCourse(CS450);
			
			
			//courses per student 
			johnDoe.addCourse(CS201);
			johnDoe.addCourse(CS360);
			johnDoe.addCourse(CS404);
			johnDoe.addCourse(CS301);
			maryJones.addCourse(CS201);
			maryJones.addCourse(CS404);
			maryJones.addCourse(CS450);
			leeJohnson.addCourse(CS201);
			leeJohnson.addCourse(CS360);
			leeJohnson.addCourse(CS240);
			leeJohnson.addCourse(CS450);
			
			System.out.println("All Members ## \n" + computer.showAllMembers());
			System.out.println("Total Salary : " + computer.getTotalSalary());
			System.out.println("\nUnits Per Faculty ## \n" + computer.unitPerFaculty());
			System.out.println("\nUnits Per Student ## \n" + computer.unitPerStudent());
			
			/*
			
			
			
			
			f1.addCourse(new Course("1", "MPP", 4));
			f1.addCourse(new Course("2", "FPP", 5));
			f1.addCourse(new Course("3", "Algorithm", 5));
			d.addPerson(f1);
			Faculty f2 = new Faculty("Raj", "5896784", 56, 458745.01);
			d.addPerson(f2);
			f2.addCourse(new Course("25", "DBA", 6));
			f2.addCourse(new Course("27", "Algorithm", 7));
			
			
			
			d.addPerson(new Staff("Hari", "256984", 29, 12000.256));
			Student s1 = new Student("Shyam", "12589963", 28, (float)3.75);
			d.addPerson(s1);
			s1.addCourse(new Course("5", "FPP", 3));
			s1.addCourse(new Course("6", "MPP", 4));
			s1.addCourse(new Course("7", "DBA", 5));
			d.addPerson(new Staff("Hari", "256984", 29, 13000.256));
*/			//System.out.println("unitPerFaculty : \n"+d.unitPerFaculty());
			//System.out.println("unitPerStudent : \n"+d.unitPerStudent());
//			System.out.println("==> "+d.getTotalSalary());
//			System.out.println(d.showAllMembers());
			

			
	}

}

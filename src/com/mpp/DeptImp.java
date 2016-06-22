package com.mpp;

public class DeptImp {

	public static void main(String[] args) {
			Department d = new Department();
			Faculty faculty = new Faculty("Bhesh", "98564788" , 27, 10000.00);
			faculty.addCourse(new Course("1", "MPP", 4));
			faculty.addCourse(new Course("2", "FPP", 5));
			faculty.addCourse(new Course("3", "Algorithm", 5));
			
			d.addPerson(faculty);
			d.addPerson(new Staff("Hari", "256984", 29, 12000.256));
			d.addPerson(new Student("Shyam", "12589963", 28, (float)3.75));
			d.addPerson(new Staff("Hari", "256984", 29, 13000.256));
			
//			System.out.println("==> "+d.getTotalSalary());
			System.out.println(d.showAllMembers());

			
	}

}

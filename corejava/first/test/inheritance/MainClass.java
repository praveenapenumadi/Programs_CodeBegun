package com.corejava.first.test.inheritance;

public class MainClass {

	public static void main(String[] args) {
		StudentInfo student = new StudentInfo();
		System.out.println(student.FName+" "+student.LName);
		System.out.println("------");
		EmployeeReg employee = new EmployeeReg();
		System.out.println(employee.CompanyName);
		System.out.println(employee.Distict);

	}

}

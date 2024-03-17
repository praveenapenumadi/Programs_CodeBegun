package com.corejava.first.test.ExceptionHandling;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
		DivideWithZero obj = new DivideWithZero();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//try {
		 int result=obj.m1(a, b);
		 System.out.println(result);
		
		}
//		catch(ArithmeticException ae) {
//			throw ae;
//			throw new ArithmeticException(" value does not divide with zero");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Finally block is reached");
//		}

	//}
	
	
	
	

}

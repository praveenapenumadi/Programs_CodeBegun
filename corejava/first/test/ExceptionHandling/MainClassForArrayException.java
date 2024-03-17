package com.corejava.first.test.ExceptionHandling;

import java.util.Scanner;

public class MainClassForArrayException {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayIndexException obj = new ArrayIndexException();
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("enter the index value to search ");
		int index = sc.nextInt();
		try {
			int result=obj.searchForValue(arr, index);
			System.out.println("the index value is present "+index);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Enter the correct values ");
		}
		catch(IndexOutOfBoundsException i) {
			i.printStackTrace();
			System.out.println("Enter the correct index value");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block ::::");
		}

	}

}

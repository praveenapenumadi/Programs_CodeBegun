package com.corejava.first.test.Arrays;

import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AscdecOrder obj = new AscdecOrder();
		
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array values");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("1.Ascending order");
		System.out.println("2.Decending order");
		System.out.println("Enter  ur choice");
		int choice=sc.nextInt();
		if(choice==1) {
			int[] result=obj.Asc(arr);;
			for(int i=0;i<result.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else
		{
			int[] result=obj.dec(arr);
			for(int i=0;i<result.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		

	}

}

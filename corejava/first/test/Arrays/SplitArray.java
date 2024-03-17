package com.corejava.first.test.Arrays;

import java.util.Scanner;

public class SplitArray {

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
		
	    System.out.println("1.firstHalf Ascending");
	    System.out.println("2.secondHalf decending");
	    int value=sc.nextInt();
	    if(value==1)
	    {
	    	
	    }
	   
	    
	    
	    

	}

}

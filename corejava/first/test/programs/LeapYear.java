package com.corejava.first.test.programs;

import java.util.Scanner;

public class LeapYear {

//	public static void main(String[] args) {
//		
//		      Scanner sc = new Scanner(System.in);
//		      int year = sc.nextInt();
//		      if(year%4==0 &&(year%100!=0 || year%400==0))
//		         System.out.println(year+" is a leapYear");
//		      else
//		         System.out.println(year+" not a leap year");
//		    }
	public boolean isLeap(int year)
	{
		boolean flag = false;
		if(year%4==0 &&(year%100!=0 || year%400==0))
		{
			flag=true;
		}
		return flag;
	}

}

package com.corejava.first.test.programs;

import java.util.Scanner;

public class EvenOrOdd {

//	public static void main(String[] args) {
//		
//		    Scanner sc = new Scanner(System.in);
//		    int num=sc.nextInt();
//		    if(num%2==0)
//		      System.out.println(num+" is a even number");
//		    else
//		       System.out.println(num+" is a odd number");
//	}
	public boolean FindNumber(int num)
	{
		boolean flag=false;
		if(num%2==0)
		{
			flag=true;
		}
		return flag;
	}

}

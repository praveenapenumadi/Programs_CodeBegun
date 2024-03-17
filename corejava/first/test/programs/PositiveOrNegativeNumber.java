package com.corejava.first.test.programs;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

//	public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//		    int num=sc.nextInt();
//		    if(num>0)
//		      System.out.println(num+" is a positive number");
//		    else{
//		      if(num==0)
//		        System.out.println(num+" neither positive nor negative");
//		      else
//		        System.out.println(num+" is a negative number");
//		       }
//	}
	public boolean PosOrNeg(int num)
	{
		boolean flag = false;
		if(num>0)
			flag=true;
		else
			flag=false;
		return flag;
	}

}

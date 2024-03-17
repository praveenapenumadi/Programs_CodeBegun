package com.corejava.first.test.operators;

public class ArithmeticOperators {
	static int add(int a,int b)
	   {
	     return a+b;
	   }
	   static int sub(int a,int b)
	   {
	    return a-b;
	   }
	   static int mul(int a,int b)
	   {
	    return a*b;
	   }
	   static float mod(int a,int b)
	   {
	    return b%a;
	   }
	public static void main(String[] args) {
		
		     int a = 10;
		     int b = 20;
		     int sum=add(a,b);
		     int minus=sub(a,b);
		     int multiply=mul(a,b);
		     float remainder= mul(a,b);
		     System.out.println(" sum is :"+sum);
		     System.out.println(" substraction is :"+minus);
		     System.out.println(" multiplication is :"+multiply);
		     System.out.println(" modulus is :"+remainder);
		           
		    }
	}



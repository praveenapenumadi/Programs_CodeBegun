package com.corejava.first.test.operators;

public class LogicalOperatorsEx {

	public static void main(String[] args) {
		int a =10,b=20;
		      if(a!=0 && b!=0)
		      {
		         System.out.println("A and B values are Non zero values");
		         if(a%2==0)
		            System.out.println("A is a even number");
		         else
		            System.out.println("A is Odd number");
		       }
		    
		      if(a==0 || b==0)
		       {
		         System.out.println("cannot able to do multiplication");
		       }
		     
		   
		      if(!(a==0))
		       System.out.println("A value is not zero");
		       
	}

}

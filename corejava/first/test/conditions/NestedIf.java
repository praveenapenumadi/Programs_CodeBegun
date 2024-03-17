package com.corejava.first.test.conditions;

public class NestedIf {

	public static void main(String[] args) {
		
		     int a=10;
		     int b=20;
		    
		     if(a!=0)
		     {
		       if(a>10)
		         System.out.println("A value is greater then 10");
		       else
		         System.out.println("A value is less than 10");
		       if(a>b)
		         System.out.println("A is greater");
		       else
		          {
		           if(a==b)
		              System.out.println("A and B values are equal ");
		           else
		              System.out.println("B is greater");
		           }
		       }
		       else
		       {
		        if(b!=0)
		           System.out.println("we can perform addition operation");
		        else
		          {
		           if(b%2==0)
		              System.out.println("B is a even number");
		            else 
		              System.out.println("B is odd number");
		          }
		      }        
	
	}

}

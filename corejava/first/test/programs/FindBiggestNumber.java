package com.corejava.first.test.programs;

public class FindBiggestNumber {

	public static void main(String[] args) {
		
		    int a = Integer.parseInt(args[0]);
		    int b = Integer.parseInt(args[1]);
		    int c = Integer.parseInt(args[2]);
		    if(a>b)
		     {
		      if(a>c)
		         System.out.println(a+" is a biggest Number");
		      else if(c>a)
		          System.out.println(c+" is a biggest Number");
		      }
		      else
		       {
		        if(b>c)
		            System.out.println(b+" is a biggest Number");
		        else
		            System.out.println(c+" is a biggest Number");
		       } 

	}

}

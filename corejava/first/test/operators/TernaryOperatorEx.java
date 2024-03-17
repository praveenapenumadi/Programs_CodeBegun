package com.corejava.first.test.operators;

public class TernaryOperatorEx {

	public static void main(String[] args) {
		
		      int a=10;
		      int b=10;
		      int max;
		      String  s =(a==b)?((a>b)? "a is big":"a and b values are equal") : "B is big";
		     max=(a>b)?a:b;
		     System.out.println(max);
		     System.out.println(s);
	}

}

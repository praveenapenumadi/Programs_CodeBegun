package com.corejava.first.test.ExceptionHandling;

public class DivideWithZero {
  int m1(int a,int b) throws Exception {
	     int c;
	 try {
		 c=a/b;
	return c;
	 }
	 catch(ArithmeticException ae) {
			//throw ae;
			throw new Exception(" value does not divide with zero");
		}
	 
  }
  
}

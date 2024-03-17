package com.corejava.first.test.methods;

public class MethodsEx {
		  
		int method1(int a,int b)
		  {
		    System.out.println("parameterized method  is called");
		    int c = a+b;
		    method2();
		    return c;
		  }
		  void method2()
		   {
		    System.out.println("method is called...");
		   }
		  public static void main(String args[])
		   {
		     int a=20;
		     int b=30;
		     
		     System.out.println("Value of a is "+a);
		     System.out.println("Value of b is "+b);
		     MethodsEx p = new MethodsEx();
		     int result=p.method1(5,10);
		     System.out.println(result);
		     
		   }
	}
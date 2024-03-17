package com.corejava.first.test.constructer;

public class ConstructerExample {

		     int a;
		     int b;
		     ConstructerExample()
		      {
		        System.out.println("Default Constructer ");
		      }
		     ConstructerExample(int a,int b)
		      {
		       this.a=a;
		       this.b=b;
		       System.out.println("Paramitarized constructer is called");
		      }
		     int sum()
		     {
		      return a+b;
		     }
		    public static void main(String args[])
		    {
		    ConstructerExample p1=new ConstructerExample();
		     System.out.println(p1.sum());
		     ConstructerExample p2=new ConstructerExample(10,20);
		     System.out.println(p2.sum());
		   }

}

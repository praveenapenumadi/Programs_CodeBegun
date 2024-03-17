 package com.corejava.first.test.forloops;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a =5;
		boolean flag = false;
		if(a==0 || a==1)
		{
			System.out.println(a+" is not a prime Number");
		}
		else
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
					flag=true;
					break;                                                                                               
				}
				
			}
		}
		if(!flag)
			System.out.println(a+" is a prime Number");
		else
			System.out.println(a+ " not a prime number");

	}

}

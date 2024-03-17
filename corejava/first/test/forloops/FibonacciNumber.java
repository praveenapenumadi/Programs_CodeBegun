package com.corejava.first.test.forloops;

public class FibonacciNumber {
	public int fibonacci(int num) {
		int a = 0;
		int b = 1;
		int sum=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<num;i++)
		{
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		return 0;
	}
}

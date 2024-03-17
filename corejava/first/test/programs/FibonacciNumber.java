package com.corejava.first.test.programs;

 class FibonacciNumber {

//	public static void main(String[] args) {
//		int a = 0;
//		int b = 1;
//		int sum=0;
//		System.out.print(a+" ");
//		System.out.print(b+" ");
//		for(int i=0;i<10;i++)
//		{
//			sum=a+b;
//			System.out.print(sum+" ");
//			a=b;
//			b=sum;
//		}
//
//	}
	
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

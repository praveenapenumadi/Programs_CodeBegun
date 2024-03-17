package com.corejava.first.test.while1;

import java.util.Scanner;

import com.corejava.first.test.forloops.FibonacciNumber;
import com.corejava.first.test.forloops.NaturalNumbers;
import com.corejava.first.test.forloops.PrimeNumberSeries;
import com.corejava.first.test.forloops.Swapping;
import com.corejava.first.test.programs.EvenOrOdd;
import com.corejava.first.test.programs.LeapYear;
import com.corejava.first.test.programs.PositiveOrNegativeNumber;



public class CodeLogic {
	
	static PrimeNumberSeries PrimeSeries = new PrimeNumberSeries();
	static FibonacciNumber fibo = new FibonacciNumber();
	static Swapping s=new Swapping();
	static NaturalNumbers natural = new NaturalNumbers();
	static EvenOrOdd number = new EvenOrOdd();
	static PositiveOrNegativeNumber PN = new PositiveOrNegativeNumber();
	static LeapYear leap = new LeapYear();
	
	static Scanner sc = new Scanner(System.in);
	public static void primary() {
		System.out.println("1.prime Number");
		System.out.println("2.primeSeries ");
		System.out.println("3.fibonacci");
		System.out.println("4.swapping");
		System.out.println("5.natural number");
		System.out.println("6.Even or odd");
		System.out.println("7.positive or negative");
		System.out.println("8.Leap Year Program");
		
		System.out.println("Please enter ur choice");
		int n = sc.nextInt();
		System.out.println("Enter your Input");
		code(n);
	}
	static void code(int n) {
		if(n==1)
		{
			int num = sc.nextInt();
			if(!PrimeSeries.IsPrime(num))
				System.out.println(num+" is a prime Number");
			else
				System.out.println(num+ " not a prime number");
		}
		else {
			if(n==2)
			{
				int num = sc.nextInt();
				for(int i=2;i<=num;i++)
				{
					
					if(!PrimeSeries.IsPrime(i))
					{
						System.out.print(i+" ");
					}
					
				}
			}
			else {
				if(n==3)
				{
					int num = sc.nextInt();
					fibo.fibonacci(num);
				}
				else {
					if(n==4)
					{
						int a =sc.nextInt();
						int b = sc.nextInt();
						s.swap(a,b);
						
						
					}
					else {
						if(n==5)
						{
							int num = sc.nextInt();
							natural.natural(num);
							System.out.println();
						}
						else
						{
							if(n==6)
							{
								int num = sc.nextInt();
								if(number.FindNumber(num))
								{
									System.out.println(num+" is a even number");
								}
								else
									System.out.println(num +" is a odd number");
							}
							else {
								if(n==7)
								{
									int num=sc.nextInt();
									if(PN.PosOrNeg(num))
										System.out.println(num+" is a positive number");
									else
										System.out.println(num+" is a negative number");
								}
								else
								{
									if(n==8)
									{
										int num = sc.nextInt();
										if(leap.isLeap(num))
											System.out.println(num +" is a leap year");
										else
											System.out.println(num +" is not leap year");
									}
									
									
									
									
								}
							}
						}
						
					}
				}
			}
		}
		
	}
}

package com.corejava.first.test.switch1;

import java.util.Scanner;
import com.corejava.first.test.forloops.FibonacciNumber;
import com.corejava.first.test.forloops.NaturalNumbers;
import com.corejava.first.test.forloops.PrimeNumberSeries;
import com.corejava.first.test.forloops.Swapping;
import com.corejava.first.test.programs.EvenOrOdd;
import com.corejava.first.test.programs.LeapYear;
import com.corejava.first.test.programs.PositiveOrNegativeNumber;


public class Programs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumberSeries PrimeSeries = new PrimeNumberSeries();
		 FibonacciNumber fibo = new FibonacciNumber();
	     Swapping s=new Swapping();
		 NaturalNumbers natural = new NaturalNumbers();
		 EvenOrOdd number = new EvenOrOdd();
		 PositiveOrNegativeNumber PN = new PositiveOrNegativeNumber();
		 LeapYear leap = new LeapYear();
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
		switch(n) {
		case 1:
		{
			System.out.println("Enter your Input");
			int num = sc.nextInt();
			if(!PrimeSeries.IsPrime(num))
				System.out.println(num+" is a prime Number");
			else
				System.out.println(num+ " not a prime number");
			break;
		}
		case 2:
		{
			System.out.println("Enter your Input");
			int num = sc.nextInt();
			for(int i=2;i<=num;i++)
			{
				
				if(!PrimeSeries.IsPrime(i))
				{
					System.out.print(i+" ");
				}
				
			}
			System.out.println();
			break;
		}
		case 3:
		{
			System.out.println("Enter your Input");
			int num = sc.nextInt();
			fibo.fibonacci(num);
			System.out.println();
			break;
		}
		case 4:
		{
			System.out.println("Enter your Input");
			int a =sc.nextInt();
			int b = sc.nextInt();
			s.swap(a,b);
			break;
		}
		case 5:
		{
			System.out.println("Enter your Input");
			int num = sc.nextInt();
			natural.natural(num);
			System.out.println();
			break;
		}
		case 6:
		{
			System.out.println("Enter your Input");
			int num = sc.nextInt();
			if(number.FindNumber(num))
			{
				System.out.println(num+" is a even number");
			}
			else
				System.out.println(num +" is a odd number");
			break;
		}
		case 7:
		{
			System.out.println("Enter your Input");
			int num=sc.nextInt();
			if(PN.PosOrNeg(num))
				System.out.println(num+" is a positive number");
			else
				System.out.println(num+" is a negative number");
			break;
		}
		case 8:
		{
			System.out.println("Enter your Input");
			int num = sc.nextInt();
			if(leap.isLeap(num))
				System.out.println(num +" is a leap year");
			else
				System.out.println(num +" is not leap year");
			break;
		}
		default:{
			System.out.println("Enter the correct choice...!");
			
		}
		
		}
		

	}

}

package com.corejava.patterns;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int k=1;
			for(int j=i;j<=n;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			int k=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}

	}

}

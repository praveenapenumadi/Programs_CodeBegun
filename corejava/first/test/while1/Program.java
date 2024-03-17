package com.corejava.first.test.while1;

import java.util.Scanner;

import com.corejava.first.test.forloops.CodeLogic;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CodeLogic cl = new CodeLogic();
		System.out.println("please enter the value to how many times the loop need to interate");
		int loop = sc.nextInt();
		while(loop!=0)
		{
			cl.primary();
			loop--;
		}

	}

}

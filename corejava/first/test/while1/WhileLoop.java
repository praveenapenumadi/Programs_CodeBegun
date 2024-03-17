package com.corejava.first.test.while1;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		int n = 1;
		while(n<=10)
		{
			if(n==8)
				break;
			if(n%2==0)
				System.out.print(n+" ");
			n++;
		}

	}

}

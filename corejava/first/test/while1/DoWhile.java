package com.corejava.first.test.while1;

public class DoWhile {

	public static void main(String[] args) {
		int n=1;
		do
		{
			n++;
			if(n==3)
				continue;
			
			System.out.print(n+" ");
		}
		while(n<=10);
		

	}

}

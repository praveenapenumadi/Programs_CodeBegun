package com.corejava.first.test.programs;

import java.util.Scanner;

public class VowelOrConsonants {

	public static void main(String[] args) {
		
		     Scanner sc = new Scanner(System.in);
		     char c = sc.next().charAt(0);
		     if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		       System.out.println( c +" is a Vowel");
		     else
		       System.out.println( c +" is a consonant");
	 }
}

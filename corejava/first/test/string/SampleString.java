package com.corejava.first.test.string;

public class SampleString {

	public static void main(String[] args) {
		String s = "Praveena";
		String s1 = "Hello";
		
		System.out.println(s);
	    String s2 = new String("hello");
	    String s3 = new String("hello");
	    System.out.println("String Methods");
	    System.out.println("to find the length of string we have 'length()' method "+s.length());
	    System.out.println("to fing index of charcter we have 'charAt()' method "+s.charAt(0));
	    System.out.println("to convert the string into upper case we have 'toUpperCase()' method "+s.toUpperCase());
	    System.out.println("to convert the string into lowe case we have 'toLowerCase()' method "+s.toLowerCase());
	    System.out.println("to remove the spaces from string we have 'trim()' method :"+s2.trim());
	    System.out.println("to find the  charcter position we have 'indexOf()' method "+s.indexOf('e'));
	    System.out.println("to check whether two strings are equal or not we have 'equals()' method "+s.equals(s1));
	    System.out.println("to check whether two strings are equal or not we have 'equalsIgnoreCase()' method "+(s2.equalsIgnoreCase(s1)));
	    System.out.println("to check whether the charcater is present in the string or not we have 'contains()' method "+s.contains("veena"));
	    s1=s1.replace('H', 'h');
	    System.out.println(s1);
	    
	}

}

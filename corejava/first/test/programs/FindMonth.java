package com.corejava.first.test.programs;

import java.util.Scanner;

public class FindMonth {

	public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      int number = sc.nextInt();
		      switch(number)
		      {
		       case 1:
		               {
		                System.out.println("Jan");
		                break;
		                }
		       case 2:
		               {
		                System.out.println("Feb");
		                break;
		                }
		       case 3:
		               {
		                System.out.println("March");
		                break;
		                }
		       case 4:
		               {
		                System.out.println("April");
		                break;
		                }
		       case 5:
		               {
		                System.out.println("May");
		                break;
		                }
		       case 6:
		               {
		                System.out.println("June");
		                break;
		                }
		       case 7:
		               {
		                System.out.println("July");
		                break;
		                }
		       case 8:
		               {
		                System.out.println("Augest");
		                break;
		                }
		       case 9:
		               {
		                System.out.println("September");
		                break;
		                }
		       case 10:
		               {
		                System.out.println("October");
		                break;
		                }
		       case 11:
		               {
		                System.out.println("November");
		                break;
		                }
		       case 12:
		               {
		                System.out.println("December");
		                break;
		                }
		       default:
		             System.out.println("Enter the correct number");
		       }
		  
	}

}

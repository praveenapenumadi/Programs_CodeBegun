package com.assesment.java;

import java.util.ArrayList;
import java.util.Scanner;

class TaxPlayer
{
	public String name;
	public int age;
	public double taxableIncome;
	public double tax;
	public String groupName;
	
	TaxPlayer(String name,int age,double taxableIncome){
		this.name=name;
		this.age=age;
		this.taxableIncome=taxableIncome;
		this.tax=tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
}



public class TaxPlayerTest {
 static int N=7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<TaxPlayer> taxPlayer = new ArrayList<>();
		int option;
		do {
			System.out.println("Menu:");
            System.out.println("1. Read, validate and store data for N taxpayers");
            System.out.println("2. Calculate and store tax and tax group for all taxpayers");
            System.out.println("3. Display all taxpayers");
            System.out.println("4. Display the name and age of all taxpayers from tax group 1");
            System.out.println("5. Search a taxpayer by age");
            System.out.println("6. Exit from the application");
            System.out.print("Enter your option: ");
           option=sc.nextInt();
           switch(option)
           {
           case 1:{
        	   readData(sc,taxPlayer);
        	   break;
           }
           case 2:
           {
        	   calculateTax(taxPlayer);
        	   break;
           }
           case 3:{
        	   displayTaxPlayers(taxPlayer);
        	   break;
           }
           case 4:
           {
        	   searchTaxPlayerByAge(sc,taxPlayer);
        	   break;
           }
           case 5:{
        	   System.out.println("Exit from the Application");
        	   break;
           }
           default:{
        	   System.out.println("Enter the correct option:");
           }
           
           }
		}while(option!=6);

	}
   public static void readData(Scanner scanner,ArrayList<TaxPlayer> taxPlayer)
   {
	   for(int i=0;i<N;i++)
	   {
		   System.out.println("enter the name:");
		   String name=scanner.next();
		   System.out.println("enter the age");
		   int age =scanner.nextInt();
		   while(age<18 || age>64)
		   {
			   System.out.println("Invalid age. age must be between 18 and 64");
			   System.out.println("enter the age :");
			   age=scanner.nextInt();
		   }
		   System.out.println("ENter the taxableIncome");
		   double taxableIncome=scanner.nextDouble();
		   while(taxableIncome<1 || taxableIncome>999000)
		   {
			   System.out.println("Inalid amount.enter the amount in between 1 and 999000");
			   taxableIncome=scanner.nextDouble();
		   }
		   taxPlayer.add(new TaxPlayer(name,age,taxableIncome));
	   }
	   
   }
   public static void calculateTax(ArrayList<TaxPlayer> taxPlayer) {
	   for(TaxPlayer taxplayer:taxPlayer)
	   {
		   double taxIncome=taxplayer.getTaxableIncome();
		   if(taxIncome>0 && taxIncome<18200)
		   {
			   taxplayer.setTax(0);
			   taxplayer.setGroupName("Group1");
		   }
		   else if(taxIncome>=18201 && taxIncome<=37000)
		   {
			   taxplayer.setTax((taxIncome-18200)*0.19);
			   taxplayer.setGroupName("Group2");
		   }
		   else if(taxIncome>=37001 && taxIncome<=87000)
		   {
			   taxplayer.setTax((taxIncome-37000)*0.325);
			   taxplayer.setGroupName("Group3");
		   }
		   else if(taxIncome>=87001 && taxIncome<=180000)
		   {
			   taxplayer.setTax((taxIncome-87000)*0.37);
			   taxplayer.setGroupName("Group4");
		   }
		   else if(taxIncome>=180001)
		   {
			   taxplayer.setTax((taxIncome-180000)*0.45);
			   taxplayer.setGroupName("Group5");
		   }
	   }
   }
   public static void displayTaxPlayers(ArrayList<TaxPlayer> Taxplayer) {
	   for(TaxPlayer taxPlayer:Taxplayer) {
		   System.out.println("Name :"+taxPlayer.getName()+" age "+taxPlayer.getAge()+" Taxable Income"+taxPlayer.getTaxableIncome()+" tax "+taxPlayer.getTax()+" group number "+taxPlayer.getGroupName());
	   }
	   for(TaxPlayer taxPlayer:Taxplayer) {
		   if(taxPlayer.getGroupName().equals("Group1"))
		   {
			   System.out.println("Name :"+taxPlayer.getName()+" age "+taxPlayer.getAge());
		   }
		   else {
			   System.out.println("the data is not related to group 1");
		   }
	   }
	   
   }
   public static void searchTaxPlayerByAge(Scanner scanner,ArrayList<TaxPlayer> taxPlayer)
   {
	   System.out.println("Enter the age to search");
	   int Search_age=scanner.nextInt();
	   boolean found=false;
	   for(TaxPlayer taxplayer:taxPlayer)
	   {
		   if(Search_age==taxplayer.getAge())
		   {
			   System.out.println("Name :"+taxplayer.getName()+" age "+taxplayer.getAge()+" Taxable Income"+taxplayer.getTaxableIncome()+" tax "+taxplayer.getTax()+" group number "+taxplayer.getGroupName());
		   }
		   found=true;
	   }
	   if(!found)
	   {
		   System.out.println("taxpayer with given age is not found");
	   }
	   
   }
   
}

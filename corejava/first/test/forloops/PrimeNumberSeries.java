package com.corejava.first.test.forloops;

public class PrimeNumberSeries {

//	public static void main(String[] args) {
//		int n = Integer.parseInt(args[0]);
	   //Scanner sc = new Scanner(System.in);
//		int count;
//		for(int i=2;i<=n;i++)
//		{
//			count=0;
//			for(int j=1;j<=n;j++)
//			{
//				if(i%j==0)
//				{
//					count++;
//				}
//			}
//			if(count==2)
//				System.out.print(i+" ");
//		}
//
//	}

	 public boolean IsPrime(int num)
	 {
		 boolean flag=false;
		 for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=true;
					                                                                                               
				}
				
			}
		 return flag;
	 }
}

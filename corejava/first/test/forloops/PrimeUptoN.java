package com.corejava.first.test.forloops;

public class PrimeUptoN {
	void IsPrime(int num)
	 {
		 int n=0;
		 int j=1,i=1;
		 int count=0;
		 while(n<num) {
			 count=0;j=1;
		 while(j<=i)
			{
				if(i%j==0)
				{
					count++;
					j++;
					                                                                                               
				}
				if(count==2) {
					System.out.print(i+" ");
					n++;
					
				}
				i++;
			}
		 }
		
		 
	 }
	
	
//	else {
//		if(n==9)
//		{
//			int num = sc.nextInt();
//			int i=2;
//			while(num>0)
//			{
//				
//				
//				if(!pp.IsPrime(i))
//				{
//					System.out.print(i+" ");
//				}
//				i++;
//				num--;
//			
//			}
//		}
}

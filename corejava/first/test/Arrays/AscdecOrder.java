package com.corejava.first.test.Arrays;

public class AscdecOrder {
	
	
	
int[] Asc(int[] arr) {
	for(int i=0;i<arr.length;i++)
	{
		int temp=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}

int[] dec(int[] arr) {
	for(int i=0;i<arr.length;i++)
	{
		int temp=0;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}

}

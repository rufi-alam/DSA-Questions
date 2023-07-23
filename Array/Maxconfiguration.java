//java Program to find the max configuration
//n=4
//Input = 8,3,1,2
//Output= 29

import java.util.Scanner;
class A
{
	public static int minConfiguration(int a[])
	{
		int n=a.length;
		int sum=0;
		int s0=0;
		int i;
		int result=0;

		for (i=0;i<a.length ;i++ ) 
		{
			sum=sum+a[i];
			s0=s0+a[i]*i;
		}
		int max=s0;
		int si=s0;

		for (i=0;i<n-1 ;i++ ) 
		{
			 result=si+sum-n*a[n-i-1];

			if (result>max) 
			{
				max=result;
			}
		si=result;
		}
	return result;
	}
	public static void main(String[] args) 
	{
		int a[]={8,3,1,2};
		System.out.print("\nMinimum configuration is "+minConfiguration(a));
	}
}
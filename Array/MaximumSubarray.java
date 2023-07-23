//Java Program to find the maximum Subarray
//input= 7
//input = 1 2 -5 4 3 8 5
//Output= 20

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size];

        System.out.print("Enter array number ");
		for (i=0;i<size ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array number ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		int sum=a[0];
		int maxSum=a[0];

		for (i=1;i<size ;i++ ) 
		{
			if (sum<0) 
			{
				sum=a[i];
			}
			else 
			{
				sum=sum+a[i];
			}
		maxSum=sum;
		}
		System.out.print("\nLargest contiguous subarray is "+maxSum);
	}
}
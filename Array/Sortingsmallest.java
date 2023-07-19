//java program to find n Smallest element in array
//n=3
//input = 3 2 1 5 6 4
//output is 3

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i,j;
		int temp;
		int n;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size];

        System.out.print("Enter array elements ");
		for (i=0;i<size ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array elements ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter second number ");
		n=r.nextInt();

		for (i=0;i<size ;i++ ) 
		{
			for (j=i+1;j<size ;j++ ) 
			{
				if (a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		if (i==n-1)
		{ 
			System.out.print(n+" largest number is "+ a[i]);
			break;
		}
		}
	}
}
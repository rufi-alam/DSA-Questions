//Minimum element in a rotated sorted array
//n= 5
//Input = 4 5 1 2 3
//Output = 1 

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int n;
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
		System.out.print("\nEnter binary search number ");
		n=r.nextInt();
		for (i=0;i<size ;i++ ) 
		{
			if (a[i]==n) 
			{
				System.out.print("This is minimum element in a sorted rotated array "+i);
				break;
			}
		}
	}
}
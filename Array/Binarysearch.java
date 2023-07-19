//Java program to find the minimum element in the sorted and rotated array
//Enter number = 5
//Enter array number = 10 20 30 50 100
//Printed array number = 10 20 30 50 100
//Enter search number = 100
//output = 100 is position found is 4

import java.util.Scanner;
class Binarysearch
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
		System.out.print("\nEnter search number ");
		n=r.nextInt();

		for (i=0;i<size ;i++ ) 
		{
			if (a[i]==n) 
			{
				System.out.print(n+"\nis the minimum element in a sorted and rotated array is "+ i);
				break;
			}
		}
	}
}
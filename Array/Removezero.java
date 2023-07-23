//Remove Leading zeros from an array
//n = 6
//Input = 0 0 0 1 2 3
//Output = 1 2 3

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
		System.out.print("\nRemove leading zero from an array ");
		for (i=0;i<size ;i++ ) 
		{
			if (a[i]!=0) 
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
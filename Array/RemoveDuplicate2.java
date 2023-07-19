//Input = 5
//Input = 1 2 2 3 3
//Output = 1 2 3

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
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
		j=0;
		for (i=0;i<size-1 ;i++ ) 
		{
			if (a[i]!=a[i+1]) 
			{
				a[j]=a[i];
				j++;
			}
		}
		a[j]=a[size-1];
		System.out.print("\nRemove duplicate array number ");
		for (i=0;i<j+1 ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
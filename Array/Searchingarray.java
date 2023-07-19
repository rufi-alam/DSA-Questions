/*java program to search elment in the array*/

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size,i,n,count=0;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size];

		for (i=0;i<size ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array elements ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter search elements ");
		n=r.nextInt();
		for (i=0;i<size ;i++ ) 
		{
			if (a[i]==n) 
			{
				count++;
			}
		}
		if (count>0) 
		{
			System.out.print("Item found "+count+" times");
		}
		else 
		{
			System.out.print("Not Item found ");
		}
	}
}
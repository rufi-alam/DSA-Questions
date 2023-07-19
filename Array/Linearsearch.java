//Linear search in java programming
//enter no=5
//enter array value= 4 5 7 12 10
//enter linear search no= 12
//output is 12 position is 4

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

		System.out.print("Enter array value ");
		for (i=0;i<size ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array elements ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter linear search number ");
		n=r.nextInt();

		for (i=0;i<size ;i++ ) 
		{
			if (a[i]==n) 
			{
				System.out.print(n+" is found the position is "+(i+1));
				break;
			}
		}
		if (i==n) 
		{
			System.out.println(n+" is not found");
		}
	}
}
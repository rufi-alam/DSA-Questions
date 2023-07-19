//Sum of copy of three elements 

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size,i,sum=0;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		int c[]=new int[size];

		for (i=0;i<size ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array elements ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		System.out.print("\naddition of array elements "+ sum);
        System.out.print("\nCopy of Second array elements ");
        for (i=0;i<size ;i++ ) 
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
			sum=sum+b[i];
		}
		System.out.print("\nAddition of copy of second array elements "+ sum);
		System.out.print("\nCopy of Third array elements ");
        for (i=0;i<size ;i++ ) 
		{
			c[i]=b[i];
			System.out.print(c[i]+" ");
			sum=sum+c[i];
		}
		System.out.print("\nAddition of copy of third array elements "+ sum);
	}
}
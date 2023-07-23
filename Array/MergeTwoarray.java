//java program to Print merge two arrays

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int n1;
		int n2;
		int i;
		Scanner r=new Scanner(System.in);
		System.out.print("\nHow many numbers print you want to first array ");
		n1=r.nextInt();
		System.out.print("\nHow many numbers print you want to Second array ");
		n2=r.nextInt();
		int n3=n2+n1;
		int a[]=new int[n1];
		int b[]=new int[n2];
		int c[]=new int[n3];

		System.out.print("\nEnter first array number ");
		for (i=0;i<n1 ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("\nEnter second array number ");
		for (i=0;i<n2 ;i++ ) 
		{
			b[i]=r.nextInt();
		}
		System.out.print("\nPrinted first array number ");
		for (i=0;i<n1 ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nPrinted Second array number ");
		for (i=0;i<n2 ;i++ ) 
		{
			System.out.print(b[i]+" ");
		}
		for (i=0;i<n1 ;i++ ) 
		{
			c[i]=a[i];
		}
		for (i=0;i<n2 ;i++ ) 
		{
			c[n1+i]=b[i];
		}
		System.out.print("\nMerge first and second array number ");
		for (i=0;i<n3 ;i++ ) 
		{
			System.out.print(c[i]+" ");
		}

	}
}
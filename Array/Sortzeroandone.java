//java progran to sort the array of 0s 1s and 2s
//n= 5
//Input = 0 2 1 2 0
//Output = 0 0 1 2 2

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
		int zerocount=0;
		int onecount=0;
		for (i=0;i<size ;i++ ) 
		{
			if (a[i]==0) 
			{
				zerocount++;
			}
			if (a[i]==1) 
			{
				onecount++;
			}
		}
		for (i=0;i<zerocount ;i++ ) 
		{
			a[i]=0;
		}
		for (i=zerocount;i<zerocount+onecount ;i++ ) 
		{
			a[i]=1;
		}
		for (i=zerocount+onecount;i<size ;i++ ) 
		{
			a[i]=2;
		}
		System.out.print("\nSort an array number of 0s 1s and 2s ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
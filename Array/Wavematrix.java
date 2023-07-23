//Print Matrix in wave form
//Size = 4
//Input= 1 9 4 10 3 6 90 11 2 30 85 72 6 31 99 15
//Output=1 3 2 6 31 30 6 9 4 90 85 99 15 72 11 10

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
		int a[][]=new int[size][size];

		System.out.print("Enter array number ");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				a[i][j]=r.nextInt();
			}
		}
		System.out.print("Printed array number: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("\nWave Traversal ");
		for (j=0;j<size ;j++ ) 
		{
			if (j%2==0) 
			{
				for (i=0;i<size ;i++ ) 
				{
					System.out.print(a[i][j]+" ");
				}
			}
			else 
			{
				for (i=size-1;i>=0;i-- ) 
				{
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}
}
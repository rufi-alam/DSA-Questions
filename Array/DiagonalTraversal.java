//Java Program to Find Diagonal Traversal
//size = 2
//Input = 11 12 21 22
//Output = 11 22 12

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
		int k;
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
		System.out.print("Printed array number \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("\nDiagonal Traversal ");
		for (k=0;k<size ;k++ ) 
		{
			for (i=0,j=k;j<size ;i++,j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
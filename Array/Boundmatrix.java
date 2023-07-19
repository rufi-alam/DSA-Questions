//sum of bound matrix
//Enter number 3
//Enter number array of matrix 1 2 3 3 2 1 2 1 3
//Printed array of matrix:
//1 2 3
//3 2 1
//2 1 3
//This is output= 16

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
		int sum=0;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[][]=new int[size][size];

		System.out.print("Enter number array of matrix ");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				a[i][j]=r.nextInt();
			}
		}
		System.out.print("Printed array of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");
		}
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				if (i==0 || j==0 || i==size-1 || j==size-1) 
				{
					sum=sum+a[i][j];
				}
			}
		}
		System.out.print("Sum of bound matrix "+ sum);
	}
}
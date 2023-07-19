//Mirror matrix progaram to user input

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size,i,j;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[][]=new int[size][size];

        System.out.print("Enter number of matrix: ");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				a[i][j]=r.nextInt();
			}
		}
		System.out.print("Printed number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("Transpose number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=size-1;j>=0 ;j-- ) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");
		}
	}
}
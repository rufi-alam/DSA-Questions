//Search in a row wise and column wise 2d matrix
//size = 4
//input = 10 20 30 40 15 25 35 45 27 29 37 48 32 33 39 50
//n = 29
//Output = 2,1

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
		int n;
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
		System.out.print("\nEnter search number in a row wise and a column wise ");
		n=r.nextInt();

		i=0;
		j=size-1;

		while (i<size && j>=0) 
		{
			if (n==a[i][j]) 
			{
				System.out.print("found at "+i+","+j);
				return;
			}
			else if (n<a[i][j])
			{
				j--;
			}
			else 
			{
				i++;
			}
		}
	}
}


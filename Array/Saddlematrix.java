//Saddle point in a matrix 
//size = 3
//input = 1 2 3 4 5 6 7 8 9
//Output = 7

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
		System.out.print("Printed array number: \n");
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
			int svj=0;
			for (j=1;j<size ;j++ ) 
			{
				if (a[i][j]<a[i][svj]) 
				{
					svj=j;
				}
			}
		boolean flag = true;
		for (k=0;k<size ;k++ ) 
		{
			if (a[k][svj]>a[i][svj]) 
			{
				flag = false;
				break;
			}
		}
		if (flag==true) 
		{
			System.out.println("Saddle point is "+a[i][svj]);
			return;
		}
		}
		System.out.println("Invalid input");
	}
}
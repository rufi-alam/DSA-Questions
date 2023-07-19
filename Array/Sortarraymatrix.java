//java Program to sorting asending order in 2d matrix

import java.util.Scanner;
class Sortarraymatrix
{
	public static void main(String[] args) 
	{
		int size;
		int i,j,k,l;
		int temp;
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
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
			   for (k=0;k<size ;k++ ) 
			   {
			   	    for (l=0;l<size ;l++ ) 
			   	    {
			   	    	if (a[i][j]<a[k][l]) 
			   	    	{
			   	    		temp=a[i][j];
			   	    		a[i][j]=a[k][l];
			   	    		a[k][l]=temp;
			   	    	}
			   	    }
			   }
			}
		}
		System.out.print("Sorted number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");
		}
	}
}
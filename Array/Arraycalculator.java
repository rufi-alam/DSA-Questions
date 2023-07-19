//java Progam calculator of 2 amatrix


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
		int b[][]=new int[size][size];
		int c[][]=new int[size][size];

        System.out.print("Enter First number of matrix: ");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				a[i][j]=r.nextInt();
			}
		}
		System.out.print("Enter Second number of matrix: ");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				b[i][j]=r.nextInt();
			}
		}
		System.out.print("Printed First number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("Printed Second number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				System.out.print(b[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("sum of First and second number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("Subtract of First and second number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("Multiply of First and second number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("Division of First and second number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				c[i][j]=a[i][j]/b[i][j];
				System.out.print(c[i][j]+" ");
			}
		System.out.print("\n");
		}
		System.out.print("Modulation of First and second number of matrix: \n");
		for (i=0;i<size ;i++ ) 
		{
			for (j=0;j<size ;j++ ) 
			{
				c[i][j]=a[i][j]%b[i][j];
				System.out.print(c[i][j]+" ");
			}
		System.out.print("\n");
		}
	}
}
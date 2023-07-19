/* Sort array elements in descending order */
// lets a[5]= 34 56 78 32 12 -----> 78 56 34 32 12 

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size,i,j;
		int temp;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size];

		for (i=0;i<size ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array elements ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		for (i=0;i<size ;i++ ) 
		{
			for (j=i+1;j<size ;j++ ) 
			{
				if (a[i]<a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\nSorted array elements ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}

	}
}
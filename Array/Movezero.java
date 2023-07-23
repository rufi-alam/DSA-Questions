//Move all zeros to end of array
//Printed array number INPUT= 2 0 3
//Move all zero to end of array OUTPUT=2 3 0

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
		int temp;
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
		for (i=0;i<size ;i++ ) 
		{
			if (a[i]==0) 
			{
				for (j=i+1;j<size ;j++ ) 
				{
					if (a[j]!=0) 
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
		}
        System.out.print("\nMove all zero to end of array ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
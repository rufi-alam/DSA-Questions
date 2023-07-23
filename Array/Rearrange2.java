//java program Move all negative elements to end
//Input= 1 -2 3 -4 5
//output= 1 3 5 -4 -2

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
		for (i=0;i<size;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		j=0;
		for (i=0;i<size ;i++ ) 
		{
			if (a[i]>0) 
			{
				if (j!=i) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			j++;
			}
		}
		System.out.print("\nRearrange array number ");
		for (i=0;i<size;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

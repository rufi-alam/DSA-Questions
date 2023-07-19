//Find the first repeating element in the array of integer
//Enter number 7
//Enter array number 1 2 3 4 1 2 7
//Printed array number 1 2 3 4 1 2 7
//Duplicate occurence is 1

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
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
			for (j=i+1;j<size ;j++ ) 
			{
				if (a[i]==a[j])
				{
					System.out.print("\nThe first repeating element in the array of integer is "+ a[i]);
					return;
				}
			}
		}
	}
}
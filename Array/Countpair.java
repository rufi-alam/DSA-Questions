//java program to count with given sum
//n=4
//sum=6
//Input=1,5,7,1
//output=2

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
		int sum=6;
		int count=0;
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
				if (a[i]+a[j]==sum) 
				{
					count++;
				}
			}
		}
		System.out.print("\nItem found "+count+ "times");
	}
}
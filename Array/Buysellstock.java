// N=5
// INPUT= 5 20 40 80 100
// OUTPUT= 95

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;

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
			if (a[i]<min) 
			{
				min=a[i];
			}
			if (a[i]-min>max) 
			{
				max=a[i]-min;
			}
		}
        System.out.print("\nBest time to buy and sell stock is "+max);
	}
}
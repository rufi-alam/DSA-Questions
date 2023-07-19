//Find Missing number in array with user input

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
		int sum1=0;
		int sum2=0;
		int sum=0;

		System.out.print("Enter number of array: ");
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
			sum1=sum1+a[i];
		}
		System.out.print("\naddition of sum1 elements "+ sum1);
		for (i=1;i<=5 ;i++ ) 
		{
			sum2=sum2+i;
		}
		System.out.print("\naddition of sum1 elements "+ sum2);
		sum=sum2-sum1;
		System.out.print("\nMissing number array is "+sum);
	}
}
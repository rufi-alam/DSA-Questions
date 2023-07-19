//java Program to rotate the element of the array
//input=1,2,3,4,5
//rotate 3 times
//1 times= 2,3,4,5,1
//2 times= 3,4,5,1,2
//3 times= 4,5,1,2,3 is the final output

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int first;
		int n;
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
		System.out.print("\nEnter rotate number ");
		n=r.nextInt();
		for (i=0;i<n ;i++ ) 
		{
			first=a[0];
			for (j=0;j<size-1 ;j++ ) 
			{
				a[j]=a[j+1];
			}
		a[j]=first;
		}
        System.out.print("\nRotate array number is ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
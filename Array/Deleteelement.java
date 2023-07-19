//Delete array elmenent
//input= 10 20 30
//output= 10 30

import java.util.Scanner;
class Deleteelement
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int loc;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size+1];

		System.out.print("Enter array number ");
		for (i=0;i<size;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array number ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter location ");
		loc=r.nextInt();
		for (i=loc;i<size-1 ;i++ ) 
		{
			a[i]=a[i+1];
		}
		size--;
		System.out.print("\ninserted array number ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

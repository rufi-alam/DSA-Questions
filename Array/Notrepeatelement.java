//java Program to first not repeat element in the array
//n=6;
//Input = 9 4 9 6 7 4
//Output = 6

import java.util.Scanner;
class Notrepeatelement
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
		int x;
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
			x=a[i];
			int count=0;
			for (j=0;j<size ;j++ ) 
			{
				if (a[j]==x) 
				{
					count++;
				}
			}
		if (count==1) 
		{
			System.out.print("\nThe first non repeating element in the array is "+a[i]);
			break;
		}
		}
	}
}
//java Program common element three sorted array
//Input:
// n1 = 1 5 10 20 40 80
// n2 = 6 7 20 80 100
// n3 = 4 15 20 30 70 80 120
//Output: 20,80

import java.util.Scanner;
class Commonelement2
{
	public static void main(String[] args) 
	{
		int n1;
		int n2;
		int n3;
		int i;
		int j;
		int k;
		Scanner r=new Scanner(System.in);
		System.out.print("\nEnter how many number you want to first array ");
		n1=r.nextInt(); 
		System.out.print("\nEnter how many number you want to Second array ");
		n2=r.nextInt();
	    System.out.print("\nEnter how many number you want to Third array ");
		n3=r.nextInt();
		int a[]=new int[n1];
		int b[]=new int[n2];
		int c[]=new int[n3];

		System.out.print("Enter first array number ");
		for (i=0;i<n1 ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Enter Second array number ");
		for (i=0;i<n2 ;i++ ) 
		{
			b[i]=r.nextInt();
		}
		System.out.print("Enter Third array number ");
		for (i=0;i<n3 ;i++ ) 
		{
			c[i]=r.nextInt();
		}
		System.out.print("\nPrinted first array number ");
		for (i=0;i<n1 ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nPrinted second array number ");
		for (i=0;i<n2 ;i++ ) 
		{
			System.out.print(b[i]+" ");
		}
		System.out.print("\nPrinted Third array number ");
		for (i=0;i<n3 ;i++ ) 
		{
			System.out.print(c[i]+" ");
		}
		System.out.print("\nCommon element First second and third array number is ");
		for (i=0;i<n1 ;i++ ) 
		{
			for (j=0;j<n2 ;j++ ) 
			{
				for (k=0;k<n3 ;k++) 
				{
					if (a[i]==b[j] && a[i]==c[k]) 
					{
						System.out.print(a[i]+" ");
					}
				}
			}
		}
	}
}
		

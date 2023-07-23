//Find pair in array with given sum
//n=7
//sum=9
//Input= 1 2 3 4 5 6 7
//Output = pair (2 , 7) Pair (3 , 6) Pair (4 , 5)

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
		int low=0;
		int high=size-1;
		int sum=9;
		while (low<high) 
		{
			if (a[low]+a[high]>sum) 
			{
				high--;
			}
			else if (a[low]+a[high]<sum) 
			{
				low++;
			}
			else if ((a[low]+a[high])==sum) 
			{
				System.out.print("\nPair (" +a[low] + " , "+ a[high] + ")");
				low++;
				high--;
			}
		}

	}
}
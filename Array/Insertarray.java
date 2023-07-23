/* Insert item in array*/

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size,i;
		int loc;
		int item;
		System.out.print("Enter size of the array ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[]=new int[size+1];

		for (i=0;i<size ;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array elements ");
		for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEnter location ");
		loc=r.nextInt();
		System.out.print("\nEnter item ");
		item=r.nextInt();

		for (i=size;i>loc ;i-- ) 
		{
			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
		System.out.print("\nInsert array element is ");
        for (i=0;i<size ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}

	}
}
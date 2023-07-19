/*java program to find length of array*/
// input = 10,20,30,40,50,60,70,80 ------> length is 8

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size,i;
		Scanner r=new Scanner(System.in);
		System.out.print("Enter any number ");
		size=r.nextInt();
		int a[]=new int[size];

		for (i=0;i<size;i++ ) 
		{
			a[i]=r.nextInt();
		}
		System.out.print("Printed array elements ");
		for (i=0;i<size;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("Length of array is "+ size);
	}
}
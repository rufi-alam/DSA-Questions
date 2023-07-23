//java program to print fibonacci series

import java.util.Scanner;
class Fibonacci
{
	public static void main(String[] args) 
	{
		int n;
		int i;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		int a=0;
		int b=1;
		int c;

		for (i=1;i<=n ;i++ ) 
		{
			System.out.print(a+" ");

			c=a+b;
			a=b;
			b=c;
		}
	}
}
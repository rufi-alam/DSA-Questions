//java program to print Tribonacci series
import java.util.Scanner;
class Tribonacci
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
		int c=2;
		int d;

		for (i=1;i<=n ;i++ ) 
		{
			System.out.print(a+" ");

			d=a+b+c;
			a=b;
			b=c;
			c=d;
		}
	}
}
/* java program to check number is armstrong or not */
// input number= 153 ----->(1*1*1 + 5*5*5 + 3*3*3)=153

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int n,m,s=0,c;
		System.out.print("Enter any number ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();//153
		c=n;//153

		while (n>0) 
		{
			m=n%10;
			s=(m*m*m)+s;
			n=n/10;
		}
		if (c==s) 
		{
			System.out.print("Armstrong number ");
		}
		else
		{
            System.out.print("Not Armstrong number ");
		}
	}
}

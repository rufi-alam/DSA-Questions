/*copy array elements*/

import java.util.Scanner;
class Copyarray
{
	public static void main(String args[])
	{
	 int a[]=new int[5];
	 int b[]=new int[5];
	 System.out.println("Enter elements of the array");
	 Scanner r=new Scanner(System.in);

	 for(int i=0;i<5;i++)
	 {
	   a[i]=r.nextInt();
	 }
	 System.out.print("\nFirst array elements ");

	 for(int i=0;i<5;i++)
	 {
	  System.out.print(a[i]+" ");
	 }
	 System.out.print("\nSecond array elements ");

	 for(int i=0;i<5;i++)
	 {
	  b[i]=a[i];
	  System.out.print(b[i]+" ");
	 }
	 
	}
}
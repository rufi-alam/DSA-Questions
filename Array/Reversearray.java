/*print array elements in reverse order*/
// input a[7] = 10,20,30,40,50,60,70 ----> 70,60,50,40,30,20,10

import java.util.Scanner;
class Reversearray
{
	public static void main(String args[])
	{
	 int a[]=new int[7];
	 System.out.print("Enter elments of the array ");
	 Scanner r=new Scanner(System.in);

	 for(int i=0;i<7;i++)
	 {
	  a[i]=r.nextInt();
	 }
	 System.out.print("Array elments ");
     
     for(int i=0;i<7;i++)
     {
      System.out.print(a[i]+" ");
     }
     System.out.print("\nReverse Array elments ");
     for(int i=7-1;i>=0;i--)
     {
      System.out.print(a[i]+" ");
     }
	}
}
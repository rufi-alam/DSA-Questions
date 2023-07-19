//java Program to mirror of matrix across diagonal
//Enter number 3
//Enter array number 1 2 4 5 9 0 3 1 7
//Input:
//Printed array number:
//1 2 4
//5 9 0
//3 1 7
//Output:
//Mirror of matrix across diagonal array number is:
//1 5 3
//2 9 1
//4 0 7

import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
		System.out.print("Enter number ");
		Scanner r=new Scanner(System.in);
		size=r.nextInt();
		int a[][]=new int[size][size];
        
        System.out.print("Enter array number ");
        for (i=0;i<size ;i++ ) 
        {
        	for (j=0;j<size ;j++ ) 
        	{
        		a[i][j]=r.nextInt();
        	}
        }
        System.out.print("Printed array number: \n");
        for (i=0;i<size ;i++ ) 
        {
        	for (j=0;j<size ;j++ ) 
        	{
        		System.out.print(a[i][j]+" ");
        	}
        System.out.print("\n");
        }
        System.out.print("Mirror of matrix across diagonal array number is: \n");
        for (i=0;i<size ;i++ ) 
        {
        	for (j=0;j<size ;j++ ) 
        	{
        		System.out.print(a[j][i]+" ");
        	}
        System.out.print("\n");
        }   
	}
}
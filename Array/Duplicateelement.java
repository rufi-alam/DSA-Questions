//Enter Number 5
//Enter array number 10 20 30 20 30
//Printed array number 10 20 30 20 30
//Duplicate element is 20
//Duplicate element is 30

import java.util.Scanner;
class Duplicateelement
{
	public static void main(String[] args) 
	{
		int size;
		int i;
		int j;
		System.out.print("Enter Number ");
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
	    for (i=0;i<size ;i++ ) 
	    {
	    	for (j=i+1;j<size ;j++ ) 
	    	{
	    		if (a[i]==a[j]) 
	    		{
	    			System.out.print("\nDuplicate element is "+a[i]);
	    		}
	    	}
	    }
	}
}
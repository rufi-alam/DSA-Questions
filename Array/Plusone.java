//java Program to find Adding one to number repsresent array of digit
//n=3
//Input = 1 2 4
//Output = 1 2 5


import java.util.Scanner;
class A
{
	public static int plusOne(int arr[])
	{
		int n=arr.length;
		int i;
		for (i=n-1;i>=0 ;i-- ) 
		{
			if (arr[i]!=9) 
			{
				arr[i]++;
				break;
			}
			else 
			{
				arr[i]=0;
			}
		}
	    if (arr[0]==0) 
		{
			int res[] = new int[n+1];
			res[0]=1;
			return res[0]; 
		}
		return arr[i];	
	}
	public static void main(String[] args) 
	{
		int arr[]={9};
		System.out.print("\nlarge integer is "+plusOne(arr));
	}
}
//java Program to find the minimum Platform
//n=6;
//Input=arrival time{1100,900,950,1800,1500,940}
//Input=Departure time{1200,910,2000,1130,1900,1120}
//Output=3


import java.util.Scanner;
import java.util.Arrays;
class A
{
	public static int minPlatforms(int a[], int d[],int n)
	{
		Arrays.sort(a);
		Arrays.sort(d);
		int count=0;
		int result=0;
		int i=0;
		int j=0;

		while (i<n) 
		{
			if (a[i]<=d[j])
			{
				count++;
				result=Math.max(result,count);
				i++;
			}
			else if (a[i]>d[j]) 
			{
				count--;
				j++;
			}
		}
	return result;
	}
	public static void main(String[] args) 
	{
		int a[]={1100,900,950,1800,1500,940};
		int d[]={1200,910,2000,1130,1900,1120};
		int n=6;
		System.out.print("\nMinimum platform is "+minPlatforms(a,d,n));
	}
}
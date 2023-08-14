//Java program to valid triangle number
//Input = 2 2 3 4
//Output = 3

import java.util.Scanner;
import java.util.Arrays;
class A
{
    public static int validTriangle(int a[])
    {
        Arrays.sort(a);
        int n = a.length;
        int count = 0;
        int i;

        for (i = n-1;i >= 2 ;i-- ) 
        {
            int j = 0;
            int k = i - 1;

            while (j < k) 
            {
                if (a[j]+a[k] > a[i]) 
                {
                    count = count + k - j;
                    k--;
                }
                else 
                {
                    j++;
                }
            }
        }
    return count;
    }
    public static void main(String[] args) 
    {
        int a[]={4,2,3,2};
        System.out.print("\nValid triangle number is "+validTriangle(a));
    }
}
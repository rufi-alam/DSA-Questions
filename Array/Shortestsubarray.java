import java.util.Scanner;
class A
{
    public static int shortestSubarray(int a[])
    {
        int n = a.length;
        int s=0;
        int e= n-1;

        while (s < n-1 && a[s] <= a[s+1]) 
        {
            s++;
            if (a[s]==n-1) 
            {
                return 0;
            }
        }
        while (e >= s && a[e] >= a[e-1]) 
        {
            e--;
            if (a[e]==0) 
            {
                return n-1;
            }
        }
        int result = Math.min(n - 1 - s, e);
        int i=0;
        int j=e;

        while (i<=s && j<n) 
        {
            if (a[j]>=a[i]) 
            {
                result = Math.min(result, j-i-1);
                i++;
            }
            else 
            {
                j++;
            }
        }
    return result;
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,10,4,2,3,5};
        System.out.print("\nShortest subarray is "+shortestSubarray(a));
    }
}
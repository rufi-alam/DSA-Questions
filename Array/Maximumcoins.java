//Maximum number of coins you can get
//Input = [4,2,5]
//Output = 4


import java.util.Scanner;
import java.util.Arrays;
class A
{
    public static int maxCoins(int a[])
    {
        Arrays.sort(a);
        int sum=0;
        int i=a.length - 2;
        int j=0;
        while (j++ < a.length/3) 
        {
            sum=sum + a[i];
            i= i-2;
        }
    return sum;
    }
    public static void main(String[] args) 
    {
        int a[]={4,2,5};
        System.out.print("\nMaximum number of coin is "+maxCoins(a));
    }
}
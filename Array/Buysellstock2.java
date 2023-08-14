//java program to find Best time to buy and sell stock 2
//Input = 1 2 3 4 5
//Output = 4

import java.util.Scanner;
class A
{
    public static int buysell(int a[])
    {
        int buysell=0;
        int i;

        for (i=1;i<a.length ;i++ ) 
        {
            if (a[i]>a[i-1]) 
            {
                buysell = buysell+a[i]-a[i-1];
            }
        }
    return buysell;
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5};
        System.out.print("\nBuy sell stock 2 is "+buysell(a));
    }
}
//Java program to find the sort Array by parity
//input = 3 1 2 4
//output = 2 4 3 1

import java.util.Scanner;
class A
{
    public static int[] sortParity(int a[])
    {
        int new_a[]= new int[a.length];
        int count=0;
        int i;

        for (i=0;i<a.length ;i++ ) 
        {
            if (a[i]%2==0) 
            {
                new_a[count]=a[i];
                count++;
            }
        }
        for (i=0;i<a.length ;i++ ) 
        {
            if (a[i]%2==1) 
            {
                new_a[count]=a[i];
                count++;
            }
        }
    return new_a;
    }
    public static void main(String[] args) 
    {
        int a[]={3,1,2,4};
        int sortedarray[]= sortParity(a);
        
        System.out.print("\nSortparity array is ");
        for (int num : sortedarray ) 
        {
            System.out.print(num+" ");
        }
    }
}
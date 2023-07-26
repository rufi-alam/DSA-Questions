// Java program to print a given matrix in spiral form

import java.util.Scanner;
class A
{
    static void spiralPrint(int m,int n,int a[][])
    {
        int i;
        int k=0;
        int l=0;

        while (k<m && l<n) 
        {
            for (i=l;i<n ;i++ ) 
            {
                System.out.print(a[k][i]+" ");
            }
            k++;
            for (i=k;i<n ;i++ ) 
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;
            if (k<m) 
            {
                for (i=n-1;i>=k ;i-- ) 
                {
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }
            if (l<n) 
            {
                for (i=m-1;i>=k ;i-- ) 
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }
        }
    }
    public static void main(String[] args)
    {
        int m = 3;
        int n = 3;
        int a[][] = { { 1,2,3},
                      { 4,5,6 },
                      { 7,8,9 }};
 
        spiralPrint(m, n, a);
    }
}
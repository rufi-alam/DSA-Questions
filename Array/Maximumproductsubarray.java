//Java program to find the maximum product subarray 
//n= 5
//Input a[]= {6,-3,-10,0,2}
//Output = 180 

import java.util.Scanner;
class A
{
  static int maxProduct(int a[])
  {
    int result=0;
    int n=a.length;
    int i;
    int j;

    for (i=0;i<n ;i++ ) 
    {
            int mul=a[i];
            for (j=i+1;j<n;j++) 
            {
              mul=mul*a[j];
              result=Math.max(result,mul);
            }
         result=Math.max(result,mul);
    }
  return result;
  }
  public static void main(String[] args) 
  {
    int a[]={6,-3,-10,0,2};
    System.out.print("]\nSubarray with maximum product is "+maxProduct(a));
  }
}

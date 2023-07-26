//java program to rotate by 90 degree in 2d matrix 
//n = 3
//Input = 1 2 3 4 5 6 7 8 9
//Output = 7 4 1 8 5 2 9 6 3

import java.util.Scanner;
class A
{
    public static void main(String[] args) 
    {
        int n;
        System.out.print("Enter number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        int a[][]=new int[n][n];

        System.out.print("Enter array number ");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
               a[i][j] = r.nextInt();
           }
        }
        System.out.print("Printed array number \n");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
               System.out.print(a[i][j]+" ");
           }
        System.out.print("\n");
        }
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = i; j < a.length; j++) 
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for (int i=0;i<a.length ;i++ ) 
        {
            int li=0;
            int ri=a[i].length-1;

            while (li<ri) 
            {
                int temp=a[i][li];
                a[i][li]=a[i][ri];
                a[i][ri]=temp;

                li++;
                ri--;
            }
        }
        display(a);
    }
    public static void display(int a[][])
    {
        System.out.print("Rotate by 90 degree \n");
        for (int i=0;i<a.length ;i++ ) 
        {
            for (int j=0;j<a.length ;j++ ) 
            {
                System.out.print(a[i][j]+" ");
            }
        System.out.print("\n");
        }
    }
}
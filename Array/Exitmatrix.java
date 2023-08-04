//java program to find exit point of matrix
//n = 3
//m = 3
//Input = 0 1 0 0 1 1 0 0 0
//Output = 1 0

import java.util.Scanner;
class A
{
    public static void main(String[] args) 
    {
        int n;
        int m;
        System.out.print("Enter number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        m=r.nextInt();
        int a[][]=new int[n][m];

        System.out.print("Enter array number ");
        for (int i = 0;i < a.length ;i++ ) 
        {
            for (int j = 0;j < a.length ;j++ ) 
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("Printed array number \n");
        for (int i = 0;i < a.length ;i++ ) 
        {
            for (int j = 0;j < a.length ;j++ ) 
            {
                System.out.print(a[i][j]+" ");
            }
        System.out.print("\n");
        }
        int dir=0;
        int i=0;
        int j=0;

        while (true) 
        {
            dir = (dir + a[i][j]) % 4;

            if (dir==0) 
            {
                j++;
            }
            else if (dir==1) 
            {
                i++;
            }
            else if (dir==2) 
            {
                j--;
            }
            else if (dir==3) 
            {
                i--;
            }

            if (i<0) 
            {
                i++;
                break;
            }
            else if (j<0) 
            {
                j++;
                break;
            }
            else if (i==a.length) 
            {
                i--;
                break;
            }
            else if (j==a.length) 
            {
                j--;
                break;
            }
        }
        System.out.println("Exit point of matrix is "+i+" "+j);
    }
}
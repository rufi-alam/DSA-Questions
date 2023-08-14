//java Program to find spiral matrix 2
//n = 3
//output = 1 2 3
//         8 9 4
//         7 6 5


import java.util.Scanner;

class A 
{
    public static int[][] spiralmatrics(int n) 
    {
        int r1 = 0;
        int r2 = n - 1;
        int c1 = 0;
        int c2 = n - 1;

        int a[][] = new int[n][n];
        int val = 1;

        while (r1 <= r2 && c1 <= c2) 
        {
            for (int i = c1; i <= c2; i++) 
            {
                a[r1][i] = val++;
            }
            for (int j = r1 + 1; j <= r2; j++) 
            {
                a[j][c2] = val++;
            }
            if (r1 < r2 && c1 < c2) {
                for (int i = c2 - 1; i > c1; i--) 
                {
                    a[r2][i] = val++;
                }
                for (int j = r2; j > r1; j--) 
                {
                    a[j][c1] = val++;
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return a;
    }

    public static void main(String[] args) 
    {
        int n = 3;
        int[][] spiralMatrix = spiralmatrics(n);

        System.out.println("Spiral matrix 2 is: \n");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(spiralMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//Find the winner of an array game 
//input = [2,1,3,5,4,6,7]
//n=2
//output = 5

import java.util.Scanner;
class A
{
    public static int getWinner(int a[],int n)
    {
        int winner = a[0];
        int count= 0;
        int i;

        for (i=1;i<a.length ;i++ ) 
        {
            if (winner>a[i])
            {
                count++;
            }
            else 
            {
                winner=a[i];
                count = 1;
            }
            if (count==n) 
            {
                return winner;
            }
        }
    return winner;
    }
    public static void main(String[] args) 
    {
        int a[]={2,1,3,5,4,6,7};
        int n=2;
        System.out.print("\nWinner game is "+getWinner(a,n));
    }
}
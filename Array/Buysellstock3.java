//java program to best time to buy sell stock with transaction fee
//n = 6
//Price = 1 3 2 8 4 9
//ouput = 8 


import java.util.Scanner;
class A
{
    public static int maxProfit(int price[],int fee)
    {
        int n=price.length;
        int profit=0;
        int buyprice= price[0];
        int i;

        for (i=1;i<n ;i++ ) 
        {
            profit=Math.max(profit, price[i]-buyprice-fee);
            buyprice=Math.min(buyprice, price[i]-profit);
        }
    return profit;
    }
    public static void main(String[] args) 
    {
        int price[]={1,3,2,8,4,9};
        int fee=2;

        System.out.print("\nBuy sell stoct with transaction fee is "+maxProfit(price,fee));
    }
}
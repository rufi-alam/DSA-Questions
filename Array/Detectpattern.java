import java.util.Scanner;
class A
{
    public static boolean containLength(int a[],int m,int k)
    {
        int count=0;
        int i;

        for (i=0;i + m < a.length ;i++ ) 
        {
            count = a[i]==a[i+m] ? count +1 : 0;

            if (count==(k-1)*m) 
            {
                return true;
            }
        }
    return false;
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,4,4,4,4};
        int m=1;
        int k=3;

        System.out.print("\ndetect pattern of length is "+containLength(a,m,k));
    }
}
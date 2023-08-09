import java.util.ArrayList;
import java.util.List;
class A
{
    public List<Integer> panCake(int a[],int k)
    {
        int n=a.length;
        List<Integer> list = new ArrayList();

        for (n=a.length-1;n>=0 ;n-- ) 
        {
            int index = find(a, n+1);
            flip(a,index);
            flip(a,n);
            list.add(index+1);
            list.add(n+1);
        }
    return list;
    }
    private int find(int a[],int k)
    {
        for (int i=0;i<a.length ;i++ ) 
        {
            if (a[i]==k) 
            {
                return i;
            }
        }
    return -1;
    }
    private void flip(int a[],int j)
    {
        int i=0;
        while (i<j) 
        {
            int temp=a[i];
            a[i++]=a[j];
            a[j--]=temp;
        }
    }
    public static void main(String[] args) 
    {
        int a[]={3,2,4,1};
        int k=3;
        A obj = new A();
        List<Integer> result = obj.panCake(a,k);
        System.out.println(result+" ");
    }
}
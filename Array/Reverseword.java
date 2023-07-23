//Reverse word in a string
//Input = "The sky is blue "
//Output = "blue is the sky "



class A
{
	public static void main(String[] args) 
	{
		int i;
		String r= "the sky is blue";
		String a[]= r.split(" ");

        System.out.print("\nPrinted string word ");
		for (i=0;i<a.length ;i++ ) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\nRevesre string word ");
		for (i=a.length-1;i>=0 ;i-- ) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
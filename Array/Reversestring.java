//Reverse string in java
//Input = Learn java
//Output = avaj nrael

class A
{
	public static void main(String[] args) 
	{
		int l;
		int i;
		String r="Learn java";
		String r2=" ";
		l=r.length();

		for (i=l-1;i>=0 ;i-- ) 
		{
			r2=r2+r.charAt(i);
		}
		System.out.print("\nReverse string is "+r2);
	}
}
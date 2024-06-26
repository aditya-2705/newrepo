class Sreverse2
{
	public static void main(String[]args)
	{
		String q="Welcome in java";
		String q1[]=q.split(" ");
		int n=q1.length;
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(q1[i]+" ");
		}
	}
}

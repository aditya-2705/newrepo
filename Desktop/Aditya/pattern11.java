class pattern11
{
	public static void main(String[]args)
	{
		int n=5;
		int i,j;
		for(i=1;i<=n;i++)
		{
			int k=n;
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}

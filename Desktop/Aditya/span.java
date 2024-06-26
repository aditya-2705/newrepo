class span
{
	public static void main(String[]args)
	{
		int a[]={70,60,50,100,80,90};
		int n=a.length;
		int span=1;
		System.out.print(span+" ");
		for(int i=1;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]>=a[j])
					span++;
				else 
					break;
			}
			System.out.print(span+" ");
			span=1;
		}
	}
}

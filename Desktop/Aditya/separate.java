class separate
{
	public static void main(String[]args)
	{
		int a[]={10,-20,30,40,-50,60,70,-80};
		int n=a.length;
		int start=0;
		int end=n-1;
		int temp;
		while(start<end)
		{
				if(a[start]>0 & a[end]<0)
				{
					temp=a[end];
					a[end]=a[start];
					a[start]=temp;
					start++;
					end--;
				}

				if(a[start]>0 & a[end]>0)
				{
					end--;
				}

				if(a[start]<0 & a[end]<0)
				{
					start++;
				}

				if(a[start]<0 & a[end]>0)
				{
					start++;
					end--;
				}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
			
	}
}
	
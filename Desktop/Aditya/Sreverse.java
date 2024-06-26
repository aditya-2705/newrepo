class Sreverse
{
	public static void main(String[]args)
	{
		String name="Aditya";
		int n=name.length();
		char a[]=name.toCharArray();
		int start=0;	
		int end=n-1;
		char temp;
		while(start<end)		
		{
			temp=a[end];
			a[end]=a[start];
			a[start]=temp;
			start++;
			end--;
		}
		System.out.print(a);
	}
}

		
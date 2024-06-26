import java.util.*;
class test
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter theS String");
		String z=sc.nextLine();
		char a[]=z.toCharArray();
		int n=z.length();
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
		for(int i=0;i<n;i++)
		{
			System.out.print(a);
		}
	}
}

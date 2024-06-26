import java.util.Scanner;
class rotate
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];
		System.out.println("Enter the Size");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int start=0;
		int end=n-1;
		int temp=0;
		while(start<end)
		{
			temp=a[end];
			a[end]=a[start];
			a[start]=temp;
			start++;
			end--;
		}
		System.out.println("reverse array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
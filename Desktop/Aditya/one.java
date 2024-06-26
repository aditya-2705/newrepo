import java.util.Scanner;
class one
{
	public static void main(String[]args)
	{
		int i,j,n;
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No of rows");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=2*i+1;j++,k++)
			{
				System.out.print(k);
			}
			System.out.println("");
		}
	}
}
		
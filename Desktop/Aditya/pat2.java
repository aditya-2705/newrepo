import java.util.Scanner;
class pat2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows");		
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

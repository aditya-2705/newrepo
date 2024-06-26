import java.util.Scanner;
class pat
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of rows");
		int n=sc.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				/*if((i+j)%2==0)
				System.out.print("0 ");
				else 	
				System.out.print("1 ");*/
				if(j%2!=0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
				if(i%2==0)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}

			}
			System.out.println();
		}
	}
}

		
	
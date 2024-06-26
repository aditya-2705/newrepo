import java.util.Scanner;
class key1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("Enter the First Number");
		x=sc.nextInt();
		System.out.println("Enter the Second Number");
		y=sc.nextInt();
		try
		{
			if(x==0 | y==0)
				throw new ArithmeticException();
			else
				System.out.println("Sum : "+(x+y));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Plz Enter only non-zero values...");
		}
		finally
		{
			System.out.println("Exceptions Successfully Handled..");
		}	
			
	}
}

		
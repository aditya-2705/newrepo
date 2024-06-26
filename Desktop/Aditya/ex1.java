import java.util.Scanner;
class ex1
{
	public static void main(String[]args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first  Number");
		x=sc.nextInt();
		System.out.println("Enter the Second Number");
		y=sc.nextInt();
		try
		{
			System.out.println("x/y : "+(x/y));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Second Number cannot be zero");
		}
		finally
		{
			System.out.println("Exception successfully handled");
		}
	}
}

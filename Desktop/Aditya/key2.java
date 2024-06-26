import java.util.*;
class key2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password");
		String password=sc.next();
		try
		{
			if(password.length()>7)
				throw new ArithmeticException();
			else
				System.out.println("You are logged in");
		}
		catch( ArithmeticException e)
		{
			System.out.println("Password length should not exceed 7");
		}
	}
}

				
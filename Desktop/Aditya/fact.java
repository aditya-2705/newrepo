import java.util.Scanner;
class factorial 
{
	void show(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of "+n+" is "+fact);
	}
}
class fact
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		factorial obj=new factorial();
		obj.show(n);
	}
}

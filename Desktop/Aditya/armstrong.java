import java.util.Scanner;
class armstrong
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,r,sum=0,temp;
		System.out.println("Enter the Number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
}

	
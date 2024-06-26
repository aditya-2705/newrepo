import java.util.Scanner;
class panildrome
{
	public static void main(String[]args)
	{
		int n,r,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Paniledrome Number");
		}
		else
		{
			System.out.println("Not a panildrome Number");
		}
	}
}

		
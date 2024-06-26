import java.util.Scanner;
class leap
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.println("Enter the year");
		year=sc.nextInt();
		String x,y,z;
		x=(year%400==0)?"leap year":"Not a leap year";
		y=(year%4==0)?"leap year":"Not a leap year";
		z=(year%100==0)?x:y;
		System.out.println(z);
	}
}


		
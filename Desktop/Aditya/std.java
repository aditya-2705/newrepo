import java.util.Scanner;
class std
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int i;
		int a[]=new int[5];
		System.out.println("Enter the Name");
		name=sc.nextLine();
		System.out.println("Enter the marks");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int total=0;
		for(i=0;i<5;i++)
		{
			total=total+a[i];
		}
		float per;
		per=(total/5);
		System.out.println("Total : "+total);
		System.out.println("Percentage : "+per);
	}
}

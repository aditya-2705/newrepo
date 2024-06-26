import java.util.*;
class fibonacci
{
	public static void main(String[]args)
	{
	int a=0;
	int b=1;
	int num,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	num=sc.nextInt();	
	for(int i=0;i<num;i++)
	{
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
	}
}

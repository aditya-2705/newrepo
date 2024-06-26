import java.util.Scanner;
//Business Logic
class addition
{
	int sum(int x,int y)
	{
		int z=x+y;
		return z;
	}
}
class substract
{
	int sub(int x,int y)
	{
		int n=x-y;
		return n;
	}
}

//Execution Logic
class add
{
	public static void main(String[]args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		x=sc.nextInt();
		System.out.println("Enter the Second Number");
		y=sc.nextInt();
		addition obj=new addition();
		int k=obj.sum(x,y);
		System.out.println("Sum = "+k);
		substract obj1=new substract();
		int m=obj1.sub(x,y);
		System.out.println("Sub = "+m);
	}
}

		
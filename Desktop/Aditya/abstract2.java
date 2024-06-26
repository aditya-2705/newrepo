abstract class operation
{
	abstract void printInfo();
}
class sum extends operation
{
	void printInfo()
	{
		int a=3;
		int b=4;
		System.out.println(a+b);
	}
}
class sub extends operation
{
	void printInfo()
	{
		int c=5;
		int d=3;
		System.out.println(c-d);
	}
}
class abstract2
{
	public static void main(String[]args)
	{
		operation n=new sum();
		n.printInfo();
		operation m=new  sub();
		m.printInfo();
	}
}

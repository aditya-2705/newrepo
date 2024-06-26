class addition
{
	void sum(int x,int y)
	{
		int sum=x+y;	
		System.out.println("Sum = "+sum);
	}
	void sum(int x,int y,int z)
	{
		int sum=x+y+z;
		System.out.println("Sum : "+sum);
	}
	void sum(int x,double y)
	{
		double sum=x+y;
		System.out.println("Sum : "+sum);
	}
	void sum(double x,int y)
	{
		double sum=x+y;
		System.out.println("Sum : "+sum);
	}
}
class i3
{
	public static void main(String[]args)
	{
		addition obj=new addition();
		obj.sum(4,5);
		obj.sum(2,3,5);
		obj.sum(5,7.7);
		obj.sum(2.4,9);
	}
}

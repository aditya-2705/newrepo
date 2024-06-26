abstract class employee
{
	abstract void show();
}
class rahul extends employee
{
	void show()
	{
		System.out.println("Employee Name : Rahul");
	}
}
class neha extends employee
{
	void show()
	{
		System.out.println("Employee Name : Neha");
	}
}
class Amethod
{
	public static void main(String[]args)
	{
		rahul r=new rahul();
		neha n=new neha();
		r.show();
		n.show();
	}
}

	
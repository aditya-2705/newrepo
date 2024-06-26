class animal
{
	void show()
	{
		System.out.println("I am an animal");
	}
}
class tiger extends animal
{
}
class test
{
	public static void main(String[]args)
	{
		tiger obj=new tiger();
		obj.shiow();
	}
}

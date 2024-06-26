interface sample
{
	int x=5;
	int y=10;
	public void show();
	public void display();
}
class Myclass implements sample
{
	public void show()
	{
		System.out.println("First Method implemented");
	}
	public void display()
	{
		System.out.println("Second Method implemented");
	}
}
class interface1
{
	public static void main(String[]args)
	{
		Myclass obj=new Myclass();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.show();
		obj.display();
	}
}

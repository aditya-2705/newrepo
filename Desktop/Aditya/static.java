class Display
{
	static int x=10;
	static int y=20;
	static void show(int x,int y)
	{
		System.out.println(x);
		System.out.println(y);
	}
}
class static 
{
	public static void main(String[]args)
	{
		Display.show();
		System.out.println(Display.x);
		System.out.println(Display.y);
	}
}
	
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
class staticc
{
	public static void main(String[]args)
	{
		Display.show(5,6);
		System.out.println(Display.x);
		System.out.println(Display.y);
	}
}
	
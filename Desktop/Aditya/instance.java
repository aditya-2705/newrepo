class Display
{
	int x=10;  //instance variable
	int y=20;  //instance variable
	void show(int x,int y)
	{
		System.out.println(this.x);
		System.out.println(this.y);
	}
}
class instance
{
	public static void main(String[]args)
	{
		Display obj=new Display();
		obj.show(5,7);
	}
}

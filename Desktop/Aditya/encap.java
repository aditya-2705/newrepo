class student
{
	private void show()
	{
		System.out.println("This is Encapsulated Method...");
	}
	void getShow()
	{
		show();
	}
}
class encap
{
	public static void main(String[]args)	
	{
	student obj=new student();
	obj.getShow();
	}
}

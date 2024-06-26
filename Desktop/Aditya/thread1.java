class Thread1 impliments Runnable
{
	public void run()
	{
		System.out.println("This Thread is created using Runnable Interface");
	}
}
class runn
{
	public static void main(String[]args)
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2(t1);
		t2.start();
	}
}

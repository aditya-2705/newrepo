class Thread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread Successfully Started");
	}
}
class ex2
{
	public static void main(String[]args)
	{
		Thread1 t1=new Thread1();
		Thread t2=new Thread(t1,"Second Thread");
		t2.start();
		System.out.println(t2.getName());
	}
}

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("First Thread");
	}
}
class th3
{
	public static void main(String[]args) throws InterruptedException
	{
		Thread t1=new Thread();
		System.out.println("Thread state : "+t1.getState());
		t1.start();
		System.out.println("Thread state : "+t1.getState());
		t1.sleep(5000);
		System.out.println("Thread state : "+t1.getState());
	}
}
	
import java.util.*;
class Thread1 extends Thread
{
	public void run()
	{
		Thread2 t2=new Thread2();
		t2.start();
		try
		{
			t2.sleep(20000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Second Thread state : "+t2.getState());
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		Thread3 t3=new Thread3();
		t3.start();
		try
		{
			t3.sleep(30000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Third Thread state : "+t3.getState());
	}
}
class Thread3 extends Thread
{
}
class exThread 
{
	public static void main(String[]args)throws InterruptedException
	{
		Thread t1=new Thread1();
		t1.start();
		t1.sleep(5000);
		System.out.println("First Thread state : "+t1.getState());
	}
}

class MyExeception extends Exception
{	
}
class keyy
{
	public static void main(String[]args)
	{
		try
		{
			throw new MyException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

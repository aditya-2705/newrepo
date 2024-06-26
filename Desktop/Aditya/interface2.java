interface vehicle
{
	void price();
}
interface car extends vehicle
{
}
class Hondacity implements car
{
	public void price()
	{
		System.out.println("Price : Rs 10Lakh");
	}
}
class interface2
{
	public static void main(String[]args)
	{
		Hondacity obj=new Hondacity();
		obj.price();
	}
}

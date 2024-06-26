class student
{
	private int rollno=101;
	String name="Pratik";
	void getRollno()
	{
		System.out.println(this.rollno);
	}
	void setRollno()
	{
		this.rollno=301;
	}
}
class encapsulation
{
	public static void main(String[]args)
	{
		student obj=new student();
		obj.getRollno();
		obj.setRollno();
		obj.getRollno();	
	}
}

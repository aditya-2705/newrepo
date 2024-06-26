class student
{
	int rollno;
	String name;
	student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
}
class constructor
{
	public static void main(String[]args)
	{
		student obj1=new student(101,"Sarvesh");
		student obj2=new student(102,"Pratik");
		student obj3=new student(103,"Aditya");
		System.out.println(obj1.rollno);
		System.out.println(obj1.name);
		System.out.println(obj2.rollno);
		System.out.println(obj2.name);
		System.out.println(obj3.rollno);
		System.out.println(obj3.name);
	}
}

		
import java.util.*;
class Adeque
{
	public static void main(String[]args)
	{
		ArrayDeque a=new ArrayDeque();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a);
		a.remove();
		a.remove();
		System.out.println(a);
	}
}

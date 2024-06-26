import java.util.Scanner;
enum level
{
	LOW,
	HIGH,
	MEDIUM
}
class enum2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input");
		String z=sc.nextLine();
		level k=z;
		switch(k)
		{
 			case LOW:
				System.out.println("This is Low input");
				break;
			case HIGH:
				System.out.println("This is High input");
				break;
			case MEDIUM:
				System.out.println("This is Medium input");
				break;
			default: 	
				System.out.println("Invalid Output");
		}
	}
}

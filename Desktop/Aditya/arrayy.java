import java.util.Scanner;
class arrayy
{
	public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter the elements");
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	int ele;
	System.out.println("Enter the Element");
	ele=sc.nextInt();
	int i;
	for(i=0;i<5;i++)
	{
		if(a[i]==ele)
		{
			System.out.println("Element is found at position "+ (i+1));
			break;
		}
	}
	if(i==5)
	{
		System.out.println("Searched element is not found");
	}
}
}

	
		
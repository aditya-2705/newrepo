import java.util.Scanner;
class array2
{
	public static void main(String[]args)
{
	int a[5]={10,20,30,40,50};
	int ele;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Element");
	ele=sc.nextInt();
	int i;
	for(i=0;i<5;i++)
	{
		if(a[i]==ele)
		{
			System.out.println("Element is found at position"+i+1);
		}
	}
}
}

	
		
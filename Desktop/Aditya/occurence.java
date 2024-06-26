import java.util.Scanner;
class occurence{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]={1,2,3,4,5,2,3,2,2,3};
int n=arr.length;
System.out.println("Enter the element");
int ele=sc.nextInt();
int k=0;
for(int i=0;i<n;i++)
{
	if(arr[i]==ele)
	{
		k++;
	}
}
System.out.println(k);
}
}
	
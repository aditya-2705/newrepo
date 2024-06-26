import java.util.Scanner;
class pattern
{
	void show(int n)
	{
		String temp="";
		if(n==1)
		return "1";
		if(n==2)
		return "11";
		String str="11";
		for(int i=3;i<=n;i++)
		{
			str+="$";
			int length=str.length();
			int count=1;
			char[]a=str.toCharArray();
			for(int j=1;j<length;j++)
			{
				if(a[j]!=a[j-1])
				{
					temp+=count;
					temp+=a[j-1];
					count=1;
				}
				else
					count++;
			}
			str=temp;
		}
		return temp+"";  	
	}
}
class lookandsay
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		pattern obj=new pattern();
		String z=obj.show(n);
		System.out.println(z);
	}
}

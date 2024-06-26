import java.util.Scanner;
class pattern2
{
	public static void main(String[]args)
	{
		int i,j,n,len;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NO of rows");
		n=sc.nextInt();
		len=2*n-1;
		for(i=0;i<len;i++)
		{
			for(j=0;j<len;j++)
			{
				int min=i<j ? i:j;
				min=min<len-i ? min:len-i-1;
				min=min<len-j-1 ? min:len-j-1;
				System.out.print(n-min+" ");
			}
			System.out.println("");	
		}
	}
}
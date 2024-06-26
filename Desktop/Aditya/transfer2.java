import java.io.*;
class transfer2
{
	public static void main(String[]args)throws IOException
{
	FileReader fread=new FileReader("file6.txt");	
	int k=0;
	while(k!=-1)
	{
		k=fread.read();
		System.out.print((char)k);
	}
}
}

	
import java.io.*;
class transform
{
	public static void main(String[]args)throws FileNotFoundException,IOException
{
	int k=0;
	FileInputStream fin=new FileInputStream("file4.txt");
	FileOutputStream fout=new FileOutputStream("file5.txt");
	while(k!=-1)
	{
		k=fin.read();
		fout.write((char)k);
	}
	System.out.println("Data is Transformed");
	fout.close();
}
}

	
import java.io.*;
class fileWriter2
{
	public static void main(String[]args)throws FileNotFoundException,IOException
{
	FileReader fread=new FileReader("file6.txt");
	FileWriter fout=new FileWriter("file7.txt");
	int k=0;
	while(k!=-1)
	{
		k=fread.read();
		fout.write((char)k);
	}
	fout.close();
	System.out.println("Data is transformed Successfully");
}
}

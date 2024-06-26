import java.io.*;
class filewriter
{
	public static void main(String[]args)throws IOException
{
	FileOutputStream obj=new FileOutputStream("file.txt");
	String data="This is the Simple Text File..";
	byte[]k=data.getBytes();
	obj.write(k);
	obj.close();
	System.out.println("Write Operation successfully....");
}
}

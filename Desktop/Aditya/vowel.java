class vowel
{
	public static void main(String[]args)
	{
		String z="Java Language is Easy to learn";
		String regex="[a,e,i,o,u,A,E,I,O,U]";
		String k=z.replaceAll(regex,"");
		System.out.print(k);
	}
}

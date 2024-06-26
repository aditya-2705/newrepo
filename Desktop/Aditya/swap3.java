class swap3
{
	public static void main(String[]args)	
	{
		int x=5;
		int y=6;
		int z=7;
		y=x+y-(x=y);
		z=y+z-(y=z);
		System.out.println("X : "+x);
		System.out.println("Y : "+y);
		System.out.println("Z : "+z);
	}
}

	
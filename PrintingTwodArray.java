class PrintingTwodArray 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[][] x= {{10,203,45,67},
			{234,566,68,23},
			{45,67,34,90}};
		for(int[] subArray :x)
		{
			/*for (int i=0;i<subArray.length; i++)
			{
				System.out.println(subArray[i]);
			}*/
			for(int i: subArray)
			{
				System.out.println(i);
			}
		     
	}
}
}

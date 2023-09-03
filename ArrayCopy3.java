import java.util.Arrays;

class ArrayCopy3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[] src= new int[]{10,20,30,45,67,78,90};
		int[] slice = Arrays.copyOfRange(src, 2,src.length);
		System.out.println(Arrays.toString(slice));

		
	}
}

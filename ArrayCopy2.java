import java.util.*;

class ArrayCopy2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int [] src = {10,20,30,40,50};
		int [] dest=new int[src.length];
		System.arraycopy(src,0,dest,0,src.length);
		System.out.println(Arrays.toString(dest));

	}
}

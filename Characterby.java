import java.util.Scanner;
public class Characterby {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		String s1=sc.next();
		for(int i=0; i<s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
	}

}

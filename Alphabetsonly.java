import java.util.Scanner;
public class Alphabetsonly {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				System.out.println(s.charAt(i));
			}
		
		}
	}

}

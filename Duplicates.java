import java.util.Scanner;
public class Duplicates {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		System.out.println("enter the character search");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
			count++;
		}
		
		}
		if(count>1)
		{
			System.out.println("duplicates");
		}
		else
		{
			System.out.println("not a duplicates");
		}

}
}
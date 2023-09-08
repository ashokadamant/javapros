import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s1=sc.next();
			System.out.println("enter the String");
			String s2=sc.next();
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag=Arrays.equals(ch1, ch2);
			if(flag)
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not a anagram");
			}

	}
	


}

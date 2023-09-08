import java.util.Scanner;
public class Alphabet {
			public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the character");
				String s=sc.next();
				String sub="";
	            // int count=0;
				for(int i=0;i<s.length();i++)
				{
					if((s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i)>='a' && s.charAt(i)<='z')
					{
						sub=sub+s.charAt(i);
					}
				}
						System.out.println(sub);
					}
				
				}
			

		




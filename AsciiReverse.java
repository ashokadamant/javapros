import java.util.Scanner;
public class AsciiReverse {
			public static void main(String [] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter character");
				String s1=sc.next();
				for(int i=s1.length()-1; i>=0; i--)
				{
					System.out.println((int)s1.charAt(i));
				}
			}

		}


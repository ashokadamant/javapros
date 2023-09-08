import java.util.Scanner;
public class Alphabetornot {
			public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the charater");
				String s1=sc.next();
				char ch=s1.charAt(s1.length()-1);
				if(ch>='A' && ch<='Z')
				{
					
				System.out.println("it is a alphabet");
			}
				else
				{
					System.out.println("it is not a alphabet");
				}

		}

	}



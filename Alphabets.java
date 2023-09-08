import java.util.Scanner;
public class Alphabets {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s =sc.next();
		String s1="";
	
		for(int i=s.length()-1; i>=0; i--) {
		
		char ch=s.charAt(i);
		System.out.print(ch);
	}

	}
}

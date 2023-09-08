import java.util.Scanner;
public class Greater{
	public static void main(StringDemo1[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pl enter marks:");
		int marks = sc.nextInt();
		if(marks>=80)
		{
		System.out.println("grade A");
		}
		else if(marks>=60)
		{
			System.out.println("grade b");
		}
		else if(marks>=35)
		{
		System.out.println("grade c");
		}
		else if(marks<35)
		{
			System.out.println("otherwise fail");
		}
			
		
	}

}

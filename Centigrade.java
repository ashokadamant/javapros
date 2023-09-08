import java.util.Scanner;
public class Centigrade {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the city name:");
		String cityname = sc.next();
		System.out.println("enter temperature value of the city in fahrenheit:");
		double temperature = sc.nextDouble();
		 
		double celsius=(temperature-32)*5/9;
		System.out.println("the temperature of the city in celsius is:"+" "+celsius);
	}

}
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ComparaterDemo {
	public static void main(String args[]) {
		Map<String, Integer> Map = new HashMap<>();
		Map.put("Dasaradhi", 20);
		Map.put("Madhu", 15);
		Map.put("Rajesh", 25);
		Map.put("Ramesh", 30);
		System.out.println("*******");
		//Map.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("******");
		Map.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("*****");
		Map.entrySet().stream().sorted(Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		System.out.println("*****");
		//Map.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}
	}


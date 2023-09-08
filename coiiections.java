import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.err;
public class coiiections {
	public  static void  main(String... ashok) {
		//int i;
		
		int[] x= {10,20,30,40,50};
		for(int i:x){
			err.println(i);
			
		}
		err.println(Arrays.toString(x));
		int[] args= {10,20,30,40};
		main((args));
		
	}
	public static void main(int[] args) {
		System.out.println(args[0]+""+args[1]+""+args[2]);
		for(int i:args) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(args));
		System.out.println("ashok");
		
	}
	
	
	
}

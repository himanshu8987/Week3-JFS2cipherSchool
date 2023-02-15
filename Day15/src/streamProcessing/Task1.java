package streamProcessing;
import java.util.ArrayList;

public class Task1 {
	
	public static void change(int num) {
		num = -num;
		System.out.println(num);
	}
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(-4);
		numbers.add(12);
		numbers.add(-5);
		numbers.add(-7);
		numbers.add(91);
		numbers.add(43);
		
		for(int n : numbers) {
			change(n);
		}
		
		
	}

}

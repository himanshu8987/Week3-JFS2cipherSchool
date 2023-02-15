package streamProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Test4 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,-44,19,21,-55,77);
		
		List<Integer> result = numbers.stream().filter(e -> e<0).collect(Collectors.toList());
		System.out.println(result);
	}
}

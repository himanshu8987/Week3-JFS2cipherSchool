package streamProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
	public static void main(String[] args) {
		List<Integer> myList = new Arrays.asList(110,136,178,142,190);
	
		List<Integer> conversion = myList.stream().map(e -> *e).collect(Collectors.toList()); 
	}

}

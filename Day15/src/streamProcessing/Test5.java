package streamProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {
	public static void main(String[] args) {
		List<Object> myList = Arrays.asList(true,100,"hello",200,false,"welcome",300,true,false);
		
		List<Object> result = myList.stream().filter(e -> e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
		System.out.println(result);
		
		myList.forEach(m->{
			System.out.println(m+" -> "+m.getClass().getSimpleName());
		});
		
		int totalIntegers = (int) myList.stream().filter(e -> e.getClass().getSimpleName().equals("Integer")).count();
		System.out.println("Total Integers "+totalIntegers);
		
		
		List <String> colors = Arrays.asList("red","blue","green","yellow","purple","green","blue");
		List<String> result2 =  colors.stream().map(e -> e.toUpperCase()).distinct().collect(Collectors.toList());
		System.out.println(result2);
	}

}

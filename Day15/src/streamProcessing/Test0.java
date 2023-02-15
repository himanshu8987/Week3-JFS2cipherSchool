package streamProcessing;
import java.util.ArrayList;

public class Test0 {
	
	public static void change(String m) {
		System.out.println(m.toUpperCase());
	}
	public static void main(String[] args) {
		// forEach 
		
//		stream is a wrapper around your data source so that we can do bulk processing conviniently and fast
		
		ArrayList<String> languages = new ArrayList<String> ();
		
		languages.add("Java");
		languages.add("CSharp");
		languages.add("Python");
		languages.add("PHP");
		
		languages.forEach(System.out::println);
		//languages.forEach(class::method);
		languages.forEach(Test0::change);
		
		for(String t: languages) {
			change(t);
		}
		change(languages.get(0));
		change(languages.get(1));
		change(languages.get(2));
		change(languages.get(3));
	}

}

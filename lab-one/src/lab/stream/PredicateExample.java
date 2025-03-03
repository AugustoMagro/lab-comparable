package lab.stream;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
	
	public static void main(String[] args) {
		List<String> wordsList = Arrays.asList("java", "PHP", "Python", "C");
		
		wordsList.stream()
			.filter(p -> p.length() > 5)
			.forEach(System.out::println);
	} 
}

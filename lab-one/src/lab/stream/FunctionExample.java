package lab.stream;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> timesTwoNumbers = numbers.stream()
				.map(n -> n * 2)
				.toList();
		
		timesTwoNumbers.forEach(n -> System.out.println(n));
		
	}
}

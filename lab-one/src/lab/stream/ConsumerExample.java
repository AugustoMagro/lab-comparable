package lab.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		// Consumer and Lambda separated
		Consumer<Integer> printNumbers = number -> {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		};
		
		numbers.stream().forEach(printNumbers);
		
		// Lambda
		numbers.forEach(n -> {
			if (n % 2 == 0) {
				System.out.println(n);
			};
		});
		
	}
}

package lab.stream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Suplier {
	public static void main(String[] args) {
		Supplier<String> hi = () -> "Hello, welcome!";
		
		// Easy
		List<String> listHi = Stream.generate(hi)
			.limit(5)
			.toList();
		
		listHi.forEach(s -> System.out.println(s));
		
		//Pro
		List<String> listHipro = Stream.generate(() -> "Hello, welcome!")
				.limit(5)
				.toList();
		listHipro.forEach(System.out::println);
	}
}

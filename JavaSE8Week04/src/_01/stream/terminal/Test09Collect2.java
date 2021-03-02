package _01.stream.terminal;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test09Collect2 {

	public static void main(String[] args) {
		Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
				.collect(
					Collectors.toMap(name -> name, name -> name.length()));
		nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
	}
}

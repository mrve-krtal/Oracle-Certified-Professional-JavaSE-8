package _02.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test09IntermediateFlatMap {

	public static void main(String[] args) {
		List<String> zero = Arrays.asList("Bird", "Dog", "Cat");
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		//
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap((List<String> l) -> l.stream()).forEach((String x) -> System.out.println(x));
		
		// <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
	}
}

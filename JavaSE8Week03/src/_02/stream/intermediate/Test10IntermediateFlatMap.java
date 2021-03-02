package _02.stream.intermediate;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test10IntermediateFlatMap {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("c", "T", "d", "B", "a", "z", "A");

		// stream.forEach(System.out::print);
		// stream.sorted().forEach(System.out::print);
		// ABTacdz

		stream.sorted(Comparator.reverseOrder()).forEach(System.out::print);
		// zdcaTBA
	}
}
// Stream<T> sorted()
// Stream<T> sorted(Comparator<? super T> comparator)

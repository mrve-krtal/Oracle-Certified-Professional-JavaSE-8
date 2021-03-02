package _02.stream.intermediate;

import java.util.stream.Stream;

public class Test04IntermediateDistinct {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("e1", "e2", "e3", "e1", "e2");
		s1.distinct().forEach(System.out::println);

		// Stream<T> distinct();
		// duplicate -> Set icin olan mantikla ayni
		// yani equals mantigi

		/*
		 * Removes duplicate elements in the stream; it uses the equals() method
		 * to determine if an element is repeated in the stream
		 */
	}
}

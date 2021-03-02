package _02.stream.intermediate;

import java.util.function.Function;
import java.util.stream.Stream;

public class Test07IntermediateMap {

	public static void main(String[] args) {

		long count = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).peek(i -> System.out.printf("%d ", i)).count();

	}

	long count = Stream.of(1, 2, 3, 4, 5)
	                .map(i -> i * i)
	                .peek(i -> System.out.printf("%d ", i))
	                .count();
}

// <R> Stream<R> map(Function<? super T, ? extends R> mapper);

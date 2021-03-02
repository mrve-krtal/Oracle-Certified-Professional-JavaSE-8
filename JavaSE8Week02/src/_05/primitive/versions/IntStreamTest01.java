package _05.primitive.versions;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IntStreamTest01 {

	public static void main(String[] args) {

		// public static IntStream range(int startInclusive, int endExclusive)

		Predicate<Integer> p1 = (Integer i) -> i % 2 == 0;
		IntPredicate ip1 = (int i) -> i%2 ==0;

		// IntStream filter(IntPredicate predicate);
		// public static IntStream range(int startInclusive, int endExclusive)
		IntStream.range(1, 10).filter(ip1).forEach(System.out::println);
	}
}

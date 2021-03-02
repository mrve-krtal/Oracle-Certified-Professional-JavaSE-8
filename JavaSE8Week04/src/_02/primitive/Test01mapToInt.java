package _02.primitive;

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test01mapToInt {

	public static void main(String[] args) {
		Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);

		// IntStream mapToInt(ToIntFunction<? super T> mapper);

		IntStream is = s1.mapToInt(t -> t);
		//

		Stream<String> s2 = Stream.of("1", "2", "3", "4", "5");

		//    public static int parseInt(String s) throws NumberFormatException {
		IntStream is2 = s2.mapToInt((String str) -> Integer.parseInt(str));
		
		IntStream is3 = s2.mapToInt(Integer::parseInt);
		
		
	}
}

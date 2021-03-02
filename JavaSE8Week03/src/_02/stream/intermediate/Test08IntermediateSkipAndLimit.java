package _02.stream.intermediate;

import java.util.stream.Stream;

public class Test08IntermediateSkipAndLimit {
	// Stream<T> limit(int maxSize)
	// Stream<T> skip(int n)

	public static void main(String[] args) {
		Stream<Integer> s = Stream.iterate(10, n -> n + 3);
		s.skip(3).limit(5).forEach(System.out::println);
	}
}

// skip etmedigimizde uretilen
/*
10
13
16
19
22
*/

// skip ettigimizde uretilen
/*
19
22
25
28
31
 */

package _01.stream.terminal;

import java.util.Optional;
import java.util.stream.Stream;

public class Test04Find {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("key1", "key2", "key3");

		Optional<String> opt = s1.findFirst();
		System.out.println(opt.get());
		// Optional<T> findFirst();
	}
}

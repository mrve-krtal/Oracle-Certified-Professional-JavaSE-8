package _04.optional;

import java.util.Optional;

public class Test01Optional {

	public static void main(String[] args) {
		Optional<String> empty = Optional.empty();
		System.out.println(empty);

		Optional<String> notEmpty = Optional.of("data");
		//
		//Optional<String> nullStr = Optional.of(null); // NPE
		//Optional<String> nullableStr = Optional.ofNullable(null);
	}
}

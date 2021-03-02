package _01.stream.terminal;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test07Reduce {

	public static void main(String[] args) {
		String[] array = new String[] { "w", "o", "l", "f" };

		String result = "";
		for (String s : array) {
			result = result + s;
		}
		//
		Stream<String> s1 = Stream.of("w", "o", "l", "f");

		BinaryOperator<String> bo = (String str, String str2) -> str + str2;
		// Optional<T> reduce(BinaryOperator<T> accumulator);
		Optional<String> opt = s1.reduce(bo);
		System.out.println(opt.get());

		//
		Stream<String> s2 = Stream.of("w", "o", "l", "f");
		String reduced = s2.reduce("#", bo);
		System.out.println(reduced);

		BinaryOperator<String> bo2 = String::concat;
		//  public String concat(String str) {
	}
}

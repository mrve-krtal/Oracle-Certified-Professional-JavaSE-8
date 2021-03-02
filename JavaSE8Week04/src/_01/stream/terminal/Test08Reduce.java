package _01.stream.terminal;

import java.util.stream.Stream;

public class Test08Reduce {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(3, 5, 6);
		//
		System.out.println(stream.reduce(2, (a, b) -> a * b));
	}
}

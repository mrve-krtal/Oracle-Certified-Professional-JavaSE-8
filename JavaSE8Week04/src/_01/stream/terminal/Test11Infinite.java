package _01.stream.terminal;

import java.util.stream.Stream;

public class Test11Infinite {

	public static void main(String[] args) {

		// Stream.generate(() -> "Elsa").forEach(System.out::println);

		// program taki kalir, sonsuz infinite streami sort etmeye calisiyor.
		// Stream.generate(() -> "Elsa").filter(n -> n.length() ==
		// 4).sorted().limit(2).forEach(System.out::println);

		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);
	}
}

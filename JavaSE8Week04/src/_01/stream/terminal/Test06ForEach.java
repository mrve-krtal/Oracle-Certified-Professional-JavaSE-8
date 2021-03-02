package _01.stream.terminal;

import java.util.stream.Stream;

public class Test06ForEach {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("element1", "element2", "element3");
		s1.forEach(System.out::println);
	}
}

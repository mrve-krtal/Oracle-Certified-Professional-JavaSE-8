package _01.stream.terminal;

import java.util.stream.Stream;

public class Test01Count {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("element1", "element2", "element3");
		long elementSize = s1.count();
		// 2kez cagiramaiyz. zaten close oldu.
		// long elementSize2 = s1.count();//
		// java.lang.IllegalStateException: stream has already been operated
		// upon or closed
		System.out.println(elementSize);
		// long count();

	}
}

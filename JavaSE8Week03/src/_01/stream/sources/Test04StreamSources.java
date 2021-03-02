package _01.stream.sources;

import java.util.stream.IntStream;

public class Test04StreamSources {

	public static void main(String[] args) {
		
		IntStream.range(1, 5).forEach(System.out::print);

		System.out.println();

		IntStream.rangeClosed(1, 5).forEach(System.out::print);
	}
}

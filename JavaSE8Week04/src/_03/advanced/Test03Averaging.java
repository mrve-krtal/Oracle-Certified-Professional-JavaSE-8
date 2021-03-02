package _03.advanced;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03Averaging {

	public static void main(String[] args) {
		Stream<String> animalStream = Stream.of("dog", "monkey", "horse", "bird", "cat");
		Double d = animalStream.collect(Collectors.averagingInt(String::length));
		System.out.println(d);
	}
}

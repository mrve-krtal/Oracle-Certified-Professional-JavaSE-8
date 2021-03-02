package _01.stream.sources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test02StreamSources {

	public static void main(String[] args) {
		Stream<String> empty = Stream.empty();
		Stream<String> s1 = Stream.of("data1", "data2", "data3", "data4");
		// public static<T> Stream<T> of(T... values) {
		
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> s2 = list.stream();
		Stream<String> s3 = list.parallelStream();
	}
}

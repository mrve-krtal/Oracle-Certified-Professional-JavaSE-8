package _01.stream.sources;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test06StreamSources {

	public static void main(String[] args) {
		new Random().ints().limit(5).forEach(System.out::println);
		//
		Stream<String> stream = Pattern.compile(" ").splitAsStream("java 8 stream test");
		stream.forEach(System.out::println);
	}
}

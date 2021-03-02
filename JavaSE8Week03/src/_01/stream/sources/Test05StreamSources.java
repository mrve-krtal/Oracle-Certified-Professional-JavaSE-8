package _01.stream.sources;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test05StreamSources {

	public static void main(String[] args) {
		IntStream intSt = Arrays.stream(new int[] { 1, 2, 3, 4 });
		Stream<Integer> stream = Arrays.stream(new Integer[] { 1, 2, 3, 4 });
	}
}

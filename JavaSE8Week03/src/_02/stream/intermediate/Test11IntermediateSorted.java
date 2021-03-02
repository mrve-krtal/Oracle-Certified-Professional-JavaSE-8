package _02.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test11IntermediateSorted {

	public static void main(String[] args) {
		List<Integer[]> listArray = Arrays.asList(new Integer[] { 1, 2, 3 }, new Integer[] { 4, 5 });
		
		// listArray.stream().map(i -> i * i).forEach(System.out::println); //
		// compiler error
		listArray.stream().flatMap(array -> Arrays.stream(array)).map(i -> i * i).forEach(System.out::println);
	}
}

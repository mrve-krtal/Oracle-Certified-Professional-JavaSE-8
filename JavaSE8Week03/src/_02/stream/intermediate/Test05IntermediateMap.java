package _02.stream.intermediate;

import java.util.function.Function;
import java.util.stream.Stream;

public class Test05IntermediateMap {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = (Integer i) -> i * 2;
		
		Stream.of(1,2,3,4,5,6).map(i -> i*2).forEach(System.out::println);
		
		
	}
}

//     <R> Stream<R> map(Function<? super T, ? extends R> mapper);

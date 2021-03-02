package _02.stream.intermediate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test03IntermediateFilter {

	public static void main(String[] args) {

		// IntStream filter(IntPredicate predicate);
		// boolean test(int value);
		IntStream.rangeClosed(0, 10).filter(i -> i % 2 == 0).forEach(System.out::println);
		
		
		IntPredicate ip = Test03IntermediateFilter::isEven;
		
		IntStream.rangeClosed(0, 10).filter(Test03IntermediateFilter::isEven).forEach(System.out::println);

	}
	
	public static boolean isEven(int i) {
	    return (i % 2) == 0;
	}
}

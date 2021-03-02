package _01.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test05Match {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("monkey", "2", "horse");
		Stream<String> infinite = Stream.generate(() -> "horse");

		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		// boolean test(T t);

		System.out.println(list.stream().anyMatch(pred));
		// boolean anyMatch(Predicate<? super T> predicate);
		// true

		// boolean allMatch(Predicate<? super T> predicate);
		System.out.println(list.stream().allMatch(pred));
		// false

		// boolean noneMatch(Predicate<? super T> predicate);
		System.out.println(list.stream().noneMatch(pred));
		// // false
		
		
		//System.out.println(infinite.anyMatch(pred));

		System.out.println(infinite.allMatch(pred));
		//infinite bir stream var hepsi eslesiyor mu diye bakiliyor.....
		
		System.out.println(infinite.allMatch(pred));
	}
}

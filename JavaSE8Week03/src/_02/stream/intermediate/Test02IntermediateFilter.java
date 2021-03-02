package _02.stream.intermediate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test02IntermediateFilter {

	public static void main(String[] args) {

		// Stream<T> filter(Predicate<? super T> predicate);

		// Predicate<T> boolean test(T t);
		Stream<String> s1 = Stream.of("ahmet", "ali", "mehmet", "ayse", "murat");

		Predicate<String> p1 = (String str) -> str.startsWith("m");
		//
		s1.filter(str -> str.startsWith("m")).forEach(System.out::println);
	}
}

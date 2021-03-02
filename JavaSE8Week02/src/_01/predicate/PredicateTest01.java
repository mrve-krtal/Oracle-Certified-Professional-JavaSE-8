package _01.predicate;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest01 {

	public static void main(String[] args) {
		
		//    boolean test(T t);
		Stream.of("hello", "world", "sample", "data", "hi").filter(str -> str.startsWith("h")).forEach(System.out::println);
		
		//Stream.of("hello", "world", "sample", "data", "hi").filter( (String str) -> str.startsWith("h"));
		
		//Predicate<String> filterLetterH = str -> str.startsWith("h");
		
		//Stream.of("hello", "world", "sample", "data", "hi").filter(filterLetterH);
		// Stream<T> filter(Predicate<? super T> predicate);
		
		
		//void forEach(Consumer<? super T> action);
	}
}

// java.util.function.Predicate<T> #boolean test(T t)
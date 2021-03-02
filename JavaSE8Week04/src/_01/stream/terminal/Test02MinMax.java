package _01.stream.terminal;

import java.util.Comparator; 
import java.util.Optional;
import java.util.stream.Stream;

public class Test02MinMax {

	public static void main(String[] args) {
		Stream<String> animalStream = Stream.of("dog", "monkey", "horse");
		Stream<String> animalStream2 = Stream.of("dog", "monkey", "horse");
		//

		// Comparator # int compare(T o1, T o2);

		Comparator<String> comparator = (String s1, String s2) -> s1.length() - s2.length();

		Optional<String> minLengthElement = animalStream.min(comparator);
		
		boolean isPresent = minLengthElement.isPresent(); // empty degilse!
		System.out.println(isPresent);
		System.out.println(minLengthElement);
		
		Optional<String> maxLengthElement2 = animalStream2.max(comparator);
		System.out.println(maxLengthElement2);
		System.out.println(maxLengthElement2.get());

		// Optional<T> min(Comparator<? super T> comparator);
		// Optional<T> max(Comparator<? super T> comparator);
	}
}

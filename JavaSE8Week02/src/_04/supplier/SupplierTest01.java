package _04.supplier;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest01 {

	public static void main(String[] args) {

		Random random = new Random();
		Supplier<Integer> supplier = random::nextInt;
		// nextInt metodu static degil, bu case icin direkt
		// sinifIsmi::methodIsmi seklinde KULLANAMAYIZ!!!
		// public int nextInt()

		Stream.generate(supplier).limit(5).forEach(System.out::println);
		
		//    Stream<T> limit(long maxSize);
	}

}

// public interface Supplier<T>
// T get();

// public static<T> Stream<T> generate(Supplier<T> s)
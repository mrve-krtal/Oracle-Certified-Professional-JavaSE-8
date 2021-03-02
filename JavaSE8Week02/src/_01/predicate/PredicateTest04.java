package _01.predicate;

import java.util.function.Predicate;

public class PredicateTest04 {

	public static void main(String[] args) {
		Predicate<String> p1 = (String x) -> x.isEmpty();
		Predicate<String> p11 = (String x) -> {
			return x.isEmpty();
		};
		// public boolean isEmpty()

		Predicate<String> p2 = String::isEmpty;
		// T -> String tipinde
		
		System.out.println(p1.test(""));
		System.out.println(p2.test(""));
		System.out.println(p2.test("not empty"));
	}
}

// Predicate<T>
// boolean test(T t);
package _01.predicate;

import java.util.function.Predicate;

public class PredicateTest02 {

	public static void main(String[] args) {

		Predicate<String> nullCheck = arg -> arg != null;
		Predicate<String> emptyCheck = x -> x.length() > 0;
		Predicate<String> mergePredicate = nullCheck.and(emptyCheck);
		
		//
		
		String message="hello world!";
		String nullStr = null;
		
		System.out.println(mergePredicate.test(message));
		System.out.println(mergePredicate.test(nullStr));
	}
}

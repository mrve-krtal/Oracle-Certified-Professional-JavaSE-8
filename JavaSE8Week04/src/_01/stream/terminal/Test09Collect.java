package _01.stream.terminal;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test09Collect {

	public static void main(String[] args) {
		//
		Stream<String> s1 = Stream.of("horse", "dog", "bird", "monkey", "cat");

		// <R, A> R collect(Collector<? super T, A, R> collector);
		// List<String> list = s1.collect(Collectors.toList());
		//List<String> list =  s1.filter(animal -> animal.length() > 3).collect(Collectors.toList());

		//Set<String> set = s1.collect(Collectors.toSet());
		//
		 s1.collect(Collectors.toCollection(TreeSet::new));
		 //    T get();
		 //s1.collect(Collectors.toCollection(() -> new TreeSet()));
		//System.out.println(list);
	}
}

package _04.optional;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test08PartitionBy {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("lions", "turtle", "bears", "bird", "horse", "tigers", "cat", "cat", "cat");
		//
		Predicate<String> p1 = s -> s.length() < 5;
		
		Map<Boolean, List<String>> map = s1.collect(Collectors.partitioningBy(p1));
		System.out.println(map);
	}
}

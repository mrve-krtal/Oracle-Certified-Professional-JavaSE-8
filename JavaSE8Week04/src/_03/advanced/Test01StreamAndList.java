package _03.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test01StreamAndList {

	public static void main(String[] args) {
		List<String> cats = new ArrayList<>();
		cats.add("Annie");
		cats.add("Ripley");
		Stream<String> stream = cats.stream();
		cats.add("KC");
		//
		//System.out.println(stream.count());
		stream.forEach(System.out::println);
	}
}

package _02.primitive;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test02average {

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = stream.average();

		// OptionalDouble average();
		
		System.out.println(optional.getAsDouble());
	}
}

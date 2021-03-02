package _01.stream.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test03MinMaxPrimitive {

	public static void main(String[] args) {
		IntStream is = IntStream.of(2, 4, 6, 10, -1, 100, 5, 200, -20, 50, 3);
		OptionalInt opt =is.min();
		
		System.out.println(opt.getAsInt());
	}
}

package _01.stream.sources;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Test01StreamSources {

	public static void main(String[] args) {
		IntStream intstream = IntStream.range(1, 6);

		System.out.println(intstream);
		// java.util.stream.IntPipeline$Head@4e25154f

		// public static IntStream iterate(final int seed, final
		// IntUnaryOperator f)
		// int applyAsInt(int operand);
		IntStream.iterate(3, i -> i + 2).limit(5).forEach(System.out::println);
	}
}

package _02.stream.intermediate;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Test06IntermediateMap {

	public static void main(String[] args) {

		//DoubleUnaryOperator     double applyAsDouble(double operand);
		DoubleUnaryOperator duo = Math::sqrt;
		//    public static double sqrt(double a)
		double sumValue = DoubleStream.of(1.0 , 4 , 9.0).map(Math::sqrt).peek(System.out::println).sum();
		System.out.println(sumValue);

	}
}

// <R> Stream<R> map(Function<? super T, ? extends R> mapper);

package _07.unary;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
		System.out.println("Before: " + ell);

		// public static int abs(int a)
		Function<Integer, Integer> f1 = Math::abs;
		IntFunction<Integer> f2 = Math::abs;
		UnaryOperator<Integer> f3 = Math::abs;
		
		ell.replaceAll(f3);
		System.out.println("After: " + ell);
	}
}

// void replaceAll(UnaryOperator<T> operator)

// @FunctionalInterface
// public interface UnaryOperator<T> extends Function<T, T> {

// List# default void replaceAll(UnaryOperator<E> operator) {
package _05.primitive.versions;

import java.util.function.Function;
import java.util.function.IntFunction;

public class PrimitiveFunctionTest01 {

	public static void main(String[] args) {

		// public static int abs(int a)
		Function<Integer, Integer> f1 = Math::abs;
		IntFunction<Integer> f2 = Math::abs;
		
		System.out.println(f1.apply(-20));
		System.out.println(f2.apply(-20));

	}
}

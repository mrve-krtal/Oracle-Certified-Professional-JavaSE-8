package _05.primitive.versions;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class PrimitiveSupplierTest01 {

	public static void main(String[] args) {

		Supplier<Integer> s1 = PrimitiveSupplierTest01::getMyNumber;

		Random random = new Random();

		// public int nextInt()
		Supplier<Integer> s2 = random::nextInt;

		IntSupplier is1 = random::nextInt;

		IntSupplier is2 = PrimitiveSupplierTest01::getMyNumber;
		
		
		System.out.println(s1.get());
		System.out.println(s2.get());
		System.out.println(is1.getAsInt());
		System.out.println(is2.getAsInt());
	}

	public static int getMyNumber() {
		return 100;
	}
}

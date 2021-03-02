package _02.primitive;

import java.util.stream.DoubleStream;

public class Test03DoubleStream {

	public static void main(String[] args) {
		DoubleStream ds = DoubleStream.of(2.5, 5, 20.4, 6.7);
		ds.forEach(System.out::println);
		// public void println(double x) {

		System.out.println("limit test:");
		// public static double random()
		DoubleStream ds2 = DoubleStream.generate(Math::random);
		ds2.limit(5).forEach(System.out::println);
	}
}

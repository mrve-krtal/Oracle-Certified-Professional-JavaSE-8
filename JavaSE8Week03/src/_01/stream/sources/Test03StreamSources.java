package _01.stream.sources;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test03StreamSources {

	public static void main(String[] args) {
		// public static<T> Stream<T> generate(Supplier<T> s) {
		
		//Supplier<T> get T();
		
		//   public static double random() 
		
		Supplier<Double> supplier = Math::random;
		Supplier<Double> supplier2 = () -> Math.random();
		//
		Stream<Double> s0 = Stream.generate(Math::random);
	}
}

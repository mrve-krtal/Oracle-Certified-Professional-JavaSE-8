package _06.binary.versions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest01 {

	public static void main(String[] args) {
		BiFunction<String, String, String> concat = (String x, String y) -> x.concat(y);
		// R apply(T t, U u);

		System.out.println(concat.apply("key1", " key2"));

		// public String concat(String str)
		BiFunction<String, String, String> concat2 = String::concat;
		
		//BiFunction<String, String, String> bifTest = String::toUpperCase;

		// public static int compare(double d1, double d2)
		BiFunction<Double, Double, Integer> bif1 = Double::compare;
		//
		// public int compareTo(Double anotherDouble)

		BiFunction<Double, Double, Integer> bif2 = Double::compareTo;

		// public String toUpperCase()
		Function<String, String> f1 = String::toUpperCase;
		Function<String, String> f2 = x -> x.toUpperCase();

		// public char[] toCharArray() {
		Function<String, char[]> f3 = x -> x.toCharArray();
		Function<String, char[]> f4 = String::toCharArray;
		
		//  public int length() 
		Function<String, Integer> f5 = String::length;
	}
}

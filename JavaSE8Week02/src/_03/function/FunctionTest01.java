package _03.function;

import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionTest01 {

	public static void main(String[] args) {
		Function<String, Integer> lengthF1 = (String str) -> str.length();
		
		Integer l1 = lengthF1.apply("injavawetrust");
		System.out.println(l1);
	}
}

//java.util.function.Function<T,R>    R apply(T t);


// java.util.stream.Stream 
//  <R> Stream<R> map(Function<? super T, ? extends R> mapper);

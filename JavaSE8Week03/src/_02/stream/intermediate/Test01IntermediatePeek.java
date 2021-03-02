package _02.stream.intermediate;

import java.util.stream.Stream;

public class Test01IntermediatePeek {

	public static void main(String[] args) {
		//long count = Stream.of(10,20,34,4,55).peek(i -> System.out.print(i + " ")).count();
		Stream<Integer> s1= Stream.of(10,20,34,4,55).peek(i -> System.out.print(i + " "));
		//peek metodu intermedaiate operation dir.
		// lazy olarak calisir. yani terminal operation yoksa bu calismaz.
		long count = s1.count();
		
		//count metodu bir terminal operationdir.
		//bir stream uzerinde terminal operation calistiktan sonra , bir baska terminal operation i cagiramayiz!
		// Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		//s1.forEach(System.out::println);
		
		System.out.println();
		//System.out.println(count);
		
	}
}

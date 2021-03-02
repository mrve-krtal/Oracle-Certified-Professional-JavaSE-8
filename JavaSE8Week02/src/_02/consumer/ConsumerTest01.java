package _02.consumer;

import java.util.function.Consumer;

public class ConsumerTest01 {

	public static void main(String[] args) {
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");
		
		 //public void println(String x) 
	}
}

// java.util.function.Consumer
// void accept(T t);

// java.util.stream.Stream
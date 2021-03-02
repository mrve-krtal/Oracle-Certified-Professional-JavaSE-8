package _02.stream.intermediate;

import java.util.stream.Stream;

public class Test12IntermediateInfinite {

	public static void main(String[] args) {
		
		//Stream.generate(() -> "Elsa").forEach(System.out::println); //inifinite calisir , generate -> infinite
		
		//Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
		// infinite datayi sort etmeye calisiyoruz , bu da mumkun olmadigi icin 
		// kodumuz takilir kalir ;
		//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

		Stream.generate(() -> "Elsa").filter(n -> n.length() == 4).limit(2).sorted().forEach(System.out::println);
	}
}

package _04.supplier;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierTest03 {

	public static void main(String[] args) {
		Supplier<String> s1 = () -> new String("test");
		Supplier<String> s2 = String::new;
		
		
		//Supplier<Integer> s3 = Integer::new; 
		
		Function<String, Integer> f1 = Integer::new;
		Function<Integer, Integer> f2 = Integer::new;
		//Function<Integer, Long> f3 = Integer::new;
		//Integer sinifinda Long alip Integer donen constructor yok!
	}
}

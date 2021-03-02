package _04.optional;

import java.util.Optional;

public class Test02Optional {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("levent");

		// opt.ifPresent(System.out::println);
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}
		//

		opt.ifPresent(System.out::println);

		Optional<String> empty = Optional.empty();
		
		if(empty.isPresent()){
			///
			//
			System.out.println("found!!");
		}
	}
}

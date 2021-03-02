package _06.binary.versions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiConsumerTest01 {

	public static void main(String[] args) {

		BiConsumer<List<Integer>, Integer> bic1 = (List<Integer> list, Integer i) -> list.add(i);
		//    boolean add(E e);
		
		BiPredicate<List<Integer>, Integer> bip1 = List::add;
		//    boolean add(E e);

		BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		List aList = new ArrayList();
		listAddElement.accept(aList, 10);
		System.out.println(aList);
	}
}

// public interface BiConsumer<T, U>
// void accept(T t, U u);
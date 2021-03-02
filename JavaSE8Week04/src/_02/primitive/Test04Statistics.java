package _02.primitive;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.IntStream;

import com.sun.nio.file.SensitivityWatchEventModifier;

public class Test04Statistics {

	public static void main(String[] args) {
		Random r = new Random();
		//    public int nextInt() {
		
		IntStream is = IntStream.generate(r ::nextInt).limit(10);
		
		
		
		IntSummaryStatistics stat = is.summaryStatistics();
		
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		System.out.println(stat.getCount());
	}
}

package lesson9.labsolns.prob10;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.*;
public class Prob10C {
	public static void main(String[] args) {
		Stream<Integer> intStream = Arrays.asList(1,2,3).stream();
		IntSummaryStatistics summary
		   = intStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("max = " + summary.getMax() + " min = " + summary.getMin());
		
	}
}

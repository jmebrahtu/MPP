package lesson9.labsolns.prob7;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		//expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		//expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);
		
	}
	
	//Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	public static void ordering1(List<Integer> list) {
		System.out.println(list.stream()
				//.sorted(Comparator.comparing(byReversing))
				.sorted(Comparator.comparing((Integer x) -> (int)Math.abs(x)).thenComparing((Integer x) -> x.intValue()))
				.collect(Collectors.toList()));
		
	}
	//static Function<String,String> byReversing = x -> (new StringBuilder(x)).reverse().toString();
	//Orders words by first reversing each and comparing 
	//in the usual way.  So 
	//    cba comes before bed
	//since
	//    cba.reverse() precedes bed.reverse()
	//in the usual ordering
	public static void ordering2(List<String> words) {
		System.out.println(words.stream()
				//.sorted(Comparator.comparing(byReversing))
				.sorted(Comparator.comparing(x -> (new StringBuilder(x)).reverse().toString()))
				.collect(Collectors.toList()));
				
	}

}

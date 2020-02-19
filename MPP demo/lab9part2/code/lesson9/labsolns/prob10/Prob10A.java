package lesson9.labsolns.prob10;

import java.util.stream.IntStream;

public class Prob10A {
	//code runs forever
	public static void main(String[] args) {
		//IntStream ones = IntStream.generate(() -> 1).distinct();
		IntStream ones = IntStream.generate(() -> 1).limit(20).distinct();
		ones.forEach(System.out::println);
	}
	
	
}

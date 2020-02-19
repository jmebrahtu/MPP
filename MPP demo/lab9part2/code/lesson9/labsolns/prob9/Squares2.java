package lesson9.labsolns.prob9;

import java.util.stream.IntStream;
import java.util.function.Function;

public class Squares2 {
	static final Function<Integer, IntStream> f =
			num -> IntStream.iterate(1, n -> nextSquare(n)).limit(num);
			
	public static void main(String[] args) {	
		printSquaresTwoTimes(4, 2);
	}
	public static void printSquaresTwoTimes(int limit, int limit2) {
		IntStream squares = f.apply(limit);
		squares.forEach(System.out::println);
		squares = f.apply(limit2);
		squares.forEach(System.out::println);
		
	}
	
	private static int nextSquare(int n) {
		return (int) Math.pow((int)Math.sqrt(n) +1,2);
	}
}

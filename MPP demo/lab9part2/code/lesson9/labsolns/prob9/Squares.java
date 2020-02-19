package lesson9.labsolns.prob9;

import java.util.stream.IntStream;

public class Squares {
	public static void main(String[] args) {	
		printSquares(10);
	}
	public static void printSquares(int limit) {
		IntStream squares = IntStream.iterate(1, n -> nextSquare(n)).limit(limit);
		squares.forEach(System.out::println);	
	}
	
	private static int nextSquare(int n) {
		return (int) Math.pow((int)Math.sqrt(n) + 1, 2);
	}
	
	
	//doesn't work but invented by student
	public static void wrongPrintSquaresByStudent(int limit) {
		IntStream squares = IntStream.iterate(2, n -> n * n).limit(limit);
		squares.forEach(System.out::println);
	
	}
}

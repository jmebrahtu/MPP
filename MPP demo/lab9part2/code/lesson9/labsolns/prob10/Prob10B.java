package lesson9.labsolns.prob10;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob10B {
	public static void main(String[] args) {
		System.out.println(Arrays.asList("Bill", "Thomas", "Mary")
				                 .stream()
				                 .collect(Collectors.joining(", ")));
	}
}

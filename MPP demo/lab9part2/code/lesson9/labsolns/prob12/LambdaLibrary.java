package lesson9.labsolns.prob12;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	/**
	 * Produces the number of Employees in list whose salary > minSalary and whose last name begins
	 * with a letter that comes after the letter ch
	 */
	public static final TriFunction<List<Employee>, Integer, Character, Long> COUNT_SAL_NAME =
			(list, minSalary, ch) ->
				list.stream()
				.filter(e -> e.getSalary() > minSalary)
				.filter(e -> e.getLastName().charAt(0) > ch)
				.count();
	
	/**
	 * Produces a list of sorted full names - all upper case -- of Employees with
	 * salary > minSalary and whose first name begins with a letter that comes before the letter ch
	 */
	public static final TriFunction<List<Employee>, Integer, Character, List<String>> LIST_SAL_NAME =
			(list, minSalary, ch) ->
				list.stream()
				.filter(e -> e.getSalary() > minSalary)
				.filter(e -> e.getFirstName().charAt(0) < ch)
				.map(e -> Employee.fullName(e).toUpperCase())
				.sorted()
				.collect(Collectors.toList());
	         
	
}

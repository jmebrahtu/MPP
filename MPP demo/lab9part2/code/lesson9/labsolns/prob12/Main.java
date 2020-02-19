package lesson9.labsolns.prob12;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//print the number of Employees in list whose salary > 100000 and whose last name begins
		//with a letter that comes after the letter 'E'
		
		long count = list.stream().filter(e -> e.getSalary() > 100000)
				.filter(e -> e.getLastName().charAt(0) > 'E').count();
		System.out.println(count);
		
		//now use LambdaLibrary
		System.out.println(LambdaLibrary.COUNT_SAL_NAME.apply(list, 100000, 'E'));
		
		//print a list of sorted full names - all upper case -- of Employees with
		//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'
		List<String> namesList = list.stream().filter(e -> e.getSalary() > 85000)
				.filter(e -> e.getFirstName().charAt(0) < 'R')
				.map(e -> Employee.fullName(e).toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(namesList);
		
		//now use LambdaLibrary
		System.out.println(LambdaLibrary.LIST_SAL_NAME.apply(list, 85000, 'R'));
		

	}

}
